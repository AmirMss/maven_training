package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void add_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.ADD, 6, 3);
        Assertions.assertThat(result).isEqualTo(9);
    }
    @Test
    void mult_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.MULT, 3, 4);
        Assertions.assertThat(result).isEqualTo(12);
    }

}
