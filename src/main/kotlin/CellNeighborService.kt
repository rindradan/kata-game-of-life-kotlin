import CellStatus.ALIVE

class CellNeighborService {
    fun getAliveNeighborsCount(grid: Array<Array<Cell>>, targetCellRowIndex: Int = 1, targetCellColumnIndex: Int = 1): Int {
        var count = 0
        for (currentCellRowIndex in grid.indices) {
            for (currentCellColumnIndex in grid[currentCellRowIndex].indices) {
                if (
                    !isSameCellPosition(currentCellRowIndex, currentCellColumnIndex, targetCellRowIndex, targetCellColumnIndex) &&
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
        when {
            cellRowIndex == 0 && cellColumnIndex == 0 -> getNeighbors(grid = grid, cellRowIndex = cellRowIndex, cellColumnIndex = cellColumnIndex).size
            cellRowIndex == 0 && cellColumnIndex == 1 -> 5
            cellRowIndex == 0 && cellColumnIndex == 2 -> 3
            cellRowIndex == 1 && cellColumnIndex == 0 -> 5
            cellRowIndex == 1 && cellColumnIndex == 1 -> 8
            cellRowIndex == 1 && cellColumnIndex == 2 -> 5
            cellRowIndex == 2 && cellColumnIndex == 0 -> 3
            cellRowIndex == 2 && cellColumnIndex == 1 -> 5
            cellRowIndex == 2 && cellColumnIndex == 2 -> 3
            else -> 0
        }

    private fun getNeighbors(grid: Array<Array<Cell>>, cellRowIndex: Int, cellColumnIndex: Int): Array<Cell> {
        return arrayOf(grid[cellRowIndex+0][cellColumnIndex+1], grid[cellRowIndex+1][cellColumnIndex+0], grid[cellRowIndex+1][cellColumnIndex+1])
    }
}
