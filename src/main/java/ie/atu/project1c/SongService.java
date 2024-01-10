package ie.atu.project1c;

import lombok.Data;
import org.springframework.stereotype.Service;
@Service
@Data
public class SongService {
        public String ackMessage(SongUser info_2)
        {
            String message = "Here are the songs from Charlie puth album Night Track Mind";
            return message;

        }


    }



