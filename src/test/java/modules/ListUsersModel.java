package modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ListUsersModel
{
    int total;
}