/**
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * <p>
 * http://ec.europa.eu/idabc/eupl
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * <p>
 * Date:      27-08-2016
 * Author(s): Sjoerd Boerhout
 * <p>
 */
package nl.dictu.prova.plugins.input.msexcel.readers.testcase;

import java.util.LinkedList;
import nl.dictu.prova.framework.TestAction;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Sjoerd Boerhout
 */
public class TestCaseReaderTest
{

  public TestCaseReaderTest()
  {
  }


  @BeforeClass
  public static void setUpClass()
  {
  }


  @AfterClass
  public static void tearDownClass()
  {
  }


  @Before
  public void setUp()
  {
  }


  @After
  public void tearDown()
  {
  }


  /**
   * Test of parseActionSheet method, of class TestCaseReader.
   */
  @Test
  public void testParseActionSheet() throws Exception
  {
  }


  /**
   * Test of parseHeaders method, of class TestCaseReader.
   */
  @Test
  public void testParseHeaders() throws Exception
  {
  }


  /**
   * Test of parsePackage method, of class TestCaseReader.
   */
  @Test
  public void testParsePackage() throws Exception
  {
  }

  public class TestCaseReaderImpl extends TestCaseReader
  {

    public LinkedList<TestAction> parseActionSheet(Sheet sheet) throws Exception
    {
      return null;
    }
  }

}
