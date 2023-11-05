import CellStatus.ALIVE
import CellStatus.DEAD
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class GameOfLifeTest {
    @Test
    fun `a cell with no neighbors should be dead by solitude`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 0)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 1 alive neighbor should be dead by underpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 1)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }
}
