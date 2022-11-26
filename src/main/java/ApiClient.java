import java.util.Arrays;
import java.io.IOException;
import com.nylas.NylasAccount;
import com.nylas.NylasClient;
import com.nylas.RequestFailedException;
import com.nylas.Draft;
import com.nylas.NameEmail;

public class ApiClient {

        public static void main() throws IOException, RequestFailedException {
            // Create client object and connect it to Nylas using
            // an account's access token
            NylasClient client = new NylasClient();
            // Provide the access token for a specific account
            NylasAccount account = client.account("j2vUSwJnLJuTq2zmHAjapppA4zoYfr");

            Draft draft = new Draft();
            draft.setSubject("ALARM");
            draft.setBody("VALUE MORE THAN 2.5");
            draft.setTo(Arrays.asList(new NameEmail("My Nylas Friend", "hodr1337@gmail.com")));

            account.drafts().send(draft);
        }
    }

