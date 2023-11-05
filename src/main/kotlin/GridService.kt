import CellStatus.ALIVE

class GridService {
    fun getAliveNeighborsCount(grid: Array<Array<Cell>>): Int {
        var count = 0
        for (rowIndex in grid.indices) {
            for (columnIndex in grid[rowIndex].indices) {
                if (!isCellInTheMiddle(rowIndex, columnIndex) && grid[rowIndex][columnIndex].status == ALIVE) count++
            }
        }
        return count
    }

    private fun isCellInTheMiddle(rowIndex: Int, columnIndex: Int): Boolean = rowIndex == 1 && columnIndex == 1
}
