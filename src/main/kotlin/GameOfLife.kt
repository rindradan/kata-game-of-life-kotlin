import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(
    private val initialGrid: Array<Array<Cell>>,
    private val gridService: GridService = GridService()
) {
    fun generateNextCell(cell: Cell, aliveNeighborsCount: Int): Cell =
        when {
            cell == Cell(ALIVE) && aliveNeighborsCount in (2..3) -> Cell(ALIVE)
            cell == Cell(DEAD) && aliveNeighborsCount == 3 -> Cell(ALIVE)
            else -> Cell(DEAD)
        }

    fun generateNextGrid(): Array<Array<Cell>> {
        val aliveNeighborsCount = gridService.getAliveNeighborsCount(initialGrid)
        val nextCell = generateNextCell(cell = initialGrid[1][1], aliveNeighborsCount = aliveNeighborsCount)
        return arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), nextCell, Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }
}
