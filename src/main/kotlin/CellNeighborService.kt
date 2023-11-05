import CellStatus.ALIVE

class CellNeighborService {
    fun getAliveNeighborsCount(
        grid: Array<Array<Cell>>,
        targetCellRowIndex: Int = 1,
        targetCellColumnIndex: Int = 1
    ): Int {
        var count = 0
        for (currentCellRowIndex in grid.indices) {
            for (currentCellColumnIndex in grid[currentCellRowIndex].indices) {
                if (
                    !isSameCellPosition(
                        currentCellRowIndex,
                        currentCellColumnIndex,
                        targetCellRowIndex,
                        targetCellColumnIndex
                    ) &&
                    grid[currentCellRowIndex][currentCellColumnIndex] == Cell(ALIVE)
                ) {
                    count++
                }
            }
        }
        return count
    }

    private fun isSameCellPosition(
        currentCellRowIndex: Int,
        currentCellColumnIndex: Int,
        targetCellRowIndex: Int,
        targetCellColumnIndex: Int
    ) = currentCellRowIndex == targetCellRowIndex && currentCellColumnIndex == targetCellColumnIndex

    fun getNeighborsCount(grid: Array<Array<Cell>>, cellRowIndex: Int, cellColumnIndex: Int): Int =
        if (cellRowIndex in grid.indices && cellColumnIndex in grid[cellRowIndex].indices) {
            getNeighbors(grid = grid, cellRowIndex = cellRowIndex, cellColumnIndex = cellColumnIndex).size
        } else 0

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
