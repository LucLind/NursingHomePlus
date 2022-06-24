package datastorage;

import model.Caregiver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CaregiverDAO extends DAOimp<Caregiver>
{
    public CaregiverDAO(Connection conn)
    {
        super(conn);
    }

    @Override
    protected String getCreateStatementString(Caregiver caregiver)
    {
        return String.format("INSERT INTO caregiver (firstname, surname, telephone) VALUES ('%s', '%s', '%s')",
                caregiver.getFirstName(),
                caregiver.getSurname(),
                caregiver.getTelephone());
    }

    @Override
    protected String getReadByIDStatementString(long cid)
    {
        return String.format("SELECT * FROM caregiver WHERE cid = %d", cid);
    }

    @Override
    protected Caregiver getInstanceFromResultSet(ResultSet set) throws SQLException
    {
        Caregiver c;
        c = new Caregiver(set.getLong(1),
                set.getString(2),
                set.getString(3),
                set.getString(4));
        return c;
    }

    @Override
    protected String getReadAllStatementString()
    {
        return "SELECT * FROM caregiver";
    }

    @Override
    protected ArrayList<Caregiver> getListFromResultSet(ResultSet set) throws SQLException
    {
        ArrayList<Caregiver> list = new ArrayList();
        Caregiver c;
        while (set.next()) {
            c = new Caregiver(set.getLong(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4));
            list.add(c);
        }
        return list;
    }

    @Override
    protected String getUpdateStatementString(Caregiver caregiver)
    {
        return String.format("UPDATE caregiver SET " +
                        "firstname = '%s', " +
                        "surname = '%s'," +
                        "telephone = '%s' " +
                        "WHERE cid = %d",
                caregiver.getFirstName(),
                caregiver.getSurname(),
                caregiver.getTelephone(),
                caregiver.getCid()
        );
    }

    @Override
    protected String getDeleteStatementString(long cid)
    {
        return String.format("Delete FROM caregiver WHERE cid=%d", cid);
    }
}