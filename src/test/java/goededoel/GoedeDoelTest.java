package goededoel;
import be.vdab.goededoel.GoedeDoel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
public class GoedeDoelTest {
    private static final String NAAM="CliniClowns";
    private GoedeDoel goedeDoel;
    @BeforeEach
    void beforeEach() {
        goedeDoel=new GoedeDoel(NAAM);
    }
    @Test
    void getNaam() {
        assertThat(goedeDoel.getNaam()).isEqualTo(NAAM);
    }
    @Test
    void eenNieuweDoelHeeftNogGeenOpbrengst(){
        assertThat(goedeDoel.getOpbrengst()).isZero();
    }
    @Test
    void doelenMetDezelfdeNaamZijnGelijk() {
        assertThat(goedeDoel).isEqualTo(new GoedeDoel(NAAM));
    }
    @Test
    void doelenMetVerschillendeNaamZijnVerschillend() {
        assertThat(goedeDoel).isNotEqualTo(new GoedeDoel("WWF"));
    }
    @Test
    void doelVerschiltVanEenObjectMetEenAnderType() {
        assertThat(goedeDoel).isNotEqualTo(BigDecimal.ZERO);
    }
    @Test
    void doelenMetDezelfdeNaamHebbenDezelfdeHashcode(){
        assertThat(goedeDoel.hashCode()).isEqualTo(new GoedeDoel(NAAM).hashCode());
    }
}
