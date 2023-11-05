import CellStatus.ALIVE

class CellNeighborService {
    fun getAliveNeighborsCount(grid: Array<Array<Cell>>, targetCellRowIndex: Int, targetCellColumnIndex: Int): Int =
        getNeighbors(grid, targetCellRowIndex, targetCellColumnIndex).filter { it == Cell(ALIVE) }.size

    private fun getNeighbors(grid: Array<Array<Cell>>, cellRowIndex: Int, cellColumnIndex: Int): Array<Cell> = arrayOf(
        getNeighbor(grid, cellRowIndex + (-1), cellColumnIndex + (-1)),
        getNeighbor(grid, cellRowIndex + (-1), cellColumnIndex + 0),
        getNeighbor(grid, cellRowIndex + (-1), cellColumnIndex + 1),
        getNeighbor(grid, cellRowIndex + 0, cellColumnIndex + (-1)),
        getNeighbor(grid, cellRowIndex + 0, cellColumnIndex + 1),
        getNeighbor(grid, cellRowIndex + 1, cellColumnIndex + (-1)),
        getNeighbor(grid, cellRowIndex + 1, cellColumnIndex + 0),
        getNeighbor(grid, cellRowIndex + 1, cellColumnIndex + 1),
    ).filterNotNull().toTypedArray()

    private fun getNeighbor(grid: Array<Array<Cell>>, cellRowIndex: Int, cellColumnIndex: Int): Cell? =
        if (cellRowIndex in grid.indices && cellColumnIndex in grid[cellRowIndex].indices) {
            grid[cellRowIndex][cellColumnIndex]
        } else null
}
