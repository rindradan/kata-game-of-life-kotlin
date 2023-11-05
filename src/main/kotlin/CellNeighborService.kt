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
}
