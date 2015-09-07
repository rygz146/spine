/**
 * SpineBean3DAO.java
 * @author David Ladapo (davidl@zphinx.com)
 * @version  1.0
 * 
 * <p>Copyright &copy;Zphinx Software Solutions</p>
 * 
 **/

package com.zphinx.spine.unittests.impl.dao;

import org.apache.log4j.Logger;

import com.zphinx.spine.Universal;
import com.zphinx.spine.data.impl.AbstractDataBaseDAO;
import com.zphinx.spine.vo.ResultObject;
import com.zphinx.spine.vo.dto.DataTransferObject;

/**
 * SpineBean3DAO
 * 
 * @author David Ladapo
 * @version $1.0
 *          <p>
 *          Created: Dec 14, 2007 10:56:24 PM<br>
 *          Copyright &copy;Zphinx Software Solutions
 *          </p>
 */
public class SpineBean3DAO extends AbstractDataBaseDAO {

    /**
     * The <code>Log</code> instance for this application.
     */

    private static Logger log = Universal.getLogger("com.zphinx.spine.unittests.impl.dao.SpineBean3DAO");

    /**
     * Public Constructor
     */
    public SpineBean3DAO() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.zphinx.spine.data.DataAbstract#fetchData(com.zphinx.spine.vo.dto.DataTransferObject)
     */
    @Override
    public Object fetchData(DataTransferObject obj) {
        ResultObject res = null;
        if(obj != null){
            log.debug("Running fetchdata . .");
            log.debug("\n\rThe object is: " + this.getClass().getSimpleName());
            log.debug("\n\rThe connection is: " + this.getConnection() + "\n\r");
            res = new ResultObject();
            res.setObj(obj);
        }
        else{
            log.debug("The object is: null");
        }
        return res;
    }

}