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

    @Test
    fun `a cell with 2 alive neighbors should be alive`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 2)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(ALIVE)
    }

    @Test
    fun `a cell with 3 alive neighbors should be alive`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 3)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(ALIVE)
    }

    @Test
    fun `a cell with 4 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 4)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 5 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 5)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 6 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, aliveNeighborsCount = 6)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }
}
