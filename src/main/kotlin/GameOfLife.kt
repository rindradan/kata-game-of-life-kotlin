import CellStatus.DEAD

class GameOfLife(cell: Cell, aliveNeighborsCount: Int) {
    fun nextGeneration(): Cell = Cell(DEAD)
}
