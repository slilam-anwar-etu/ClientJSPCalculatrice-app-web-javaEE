
package serviceclientjsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour add complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "i",
    "j"
})
public class Add {

    protected int i;
    protected int j;

    /**
     * Obtient la valeur de la propriété i.
     * 
     */
    public int getI() {
        return i;
    }

    /**
     * Définit la valeur de la propriété i.
     * 
     */
    public void setI(int value) {
        this.i = value;
    }

    /**
     * Obtient la valeur de la propriété j.
     * 
     */
    public int getJ() {
        return j;
    }

    /**
     * Définit la valeur de la propriété j.
     * 
     */
    public void setJ(int value) {
        this.j = value;
    }

}
