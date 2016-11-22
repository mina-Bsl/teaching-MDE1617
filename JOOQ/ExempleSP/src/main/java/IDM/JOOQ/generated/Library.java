/**
 * This class is generated by jOOQ
 */
package IDM.JOOQ.generated;


import IDM.JOOQ.generated.tables.Author;
import IDM.JOOQ.generated.tables.Dept;
import IDM.JOOQ.generated.tables.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Library extends SchemaImpl {

    private static final long serialVersionUID = -241239245;

    /**
     * The reference instance of <code>library</code>
     */
    public static final Library LIBRARY = new Library();

    /**
     * The table <code>library.author</code>.
     */
    public final Author AUTHOR = IDM.JOOQ.generated.tables.Author.AUTHOR;

    /**
     * The table <code>library.dept</code>.
     */
    public final Dept DEPT = IDM.JOOQ.generated.tables.Dept.DEPT;

    /**
     * The table <code>library.emp</code>.
     */
    public final Emp EMP = IDM.JOOQ.generated.tables.Emp.EMP;

    /**
     * No further instances allowed
     */
    private Library() {
        super("library", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Dept.DEPT,
            Emp.EMP);
    }
}
