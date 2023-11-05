import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(
    private val initialGrid: Array<Array<Cell>>,
    private val cellNeighborService: CellNeighborService = CellNeighborService()
) {
    fun generateNextCell(cell: Cell, aliveNeighborsCount: Int): Cell =
        when {
            cell == Cell(ALIVE) && aliveNeighborsCount in (2..3) -> Cell(ALIVE)
            cell == Cell(DEAD) && aliveNeighborsCount == 3 -> Cell(ALIVE)
            else -> Cell(DEAD)
        }

    fun generateNextGrid(): Array<Array<Cell>> = arrayOf(
        arrayOf(generateNextCell(0, 0), generateNextCell(0, 1), generateNextCell(0, 2)),
        arrayOf(generateNextCell(1, 0), generateNextCell(1, 1), generateNextCell(1, 2)),
        arrayOf(generateNextCell(2, 0), generateNextCell(2, 1), generateNextCell(2, 2)),
    )

    private fun generateNextCell(cellRowIndex: Int, cellColumnIndex: Int): Cell {
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(
            grid = initialGrid,
            targetCellRowIndex = cellRowIndex,
            targetCellColumnIndex = cellColumnIndex,
        )
        val cell = initialGrid[cellRowIndex][cellColumnIndex]
        return generateNextCell(cell = cell, aliveNeighborsCount = aliveNeighborsCount)
    }
}
