import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(
    private val initialGrid: Array<Array<Cell>>,
    private val cellNeighborService: CellNeighborService = CellNeighborService()
) {
    fun generateNextGrid(): Array<Array<Cell>> {
        val cells = mutableListOf<List<Cell>>()
        for (rowIndex in initialGrid.indices) {
            val rowCells = mutableListOf<Cell>()
            for (columnIndex in initialGrid[rowIndex].indices) {
                rowCells.add(columnIndex, generateNextCell(rowIndex, columnIndex))
            }
            cells.add(rowIndex, rowCells)
        }
        return cells.map { it.toTypedArray() }.toTypedArray()
    }

    private fun generateNextCell(cellRowIndex: Int, cellColumnIndex: Int): Cell {
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(
            grid = initialGrid,
            targetCellRowIndex = cellRowIndex,
            targetCellColumnIndex = cellColumnIndex,
        )
        val cell = initialGrid[cellRowIndex][cellColumnIndex]
        return generateNextCell(cell = cell, aliveNeighborsCount = aliveNeighborsCount)
    }

    private fun generateNextCell(cell: Cell, aliveNeighborsCount: Int): Cell =
        when {
            cell == Cell(ALIVE) && aliveNeighborsCount in (2..3) -> Cell(ALIVE)
            cell == Cell(DEAD) && aliveNeighborsCount == 3 -> Cell(ALIVE)
            else -> Cell(DEAD)
        }
}
