package proje.v1.api.converter.user;

import org.springframework.stereotype.Component;
import proje.v1.api.common.domain.BaseModel;
import proje.v1.api.converter.Converter;
import proje.v1.api.domian.user.Users;
import proje.v1.api.dto.user.UserDTO;

@Component
public class UserConverter implements Converter<Users, UserDTO> {
    @Override
    public UserDTO convert(Users user) {
        return new UserDTO(
                user.getUsername(),
                user.getEmail(),
                user.getName(),
                user.getSurname(),
                user.getUserRole(),
                user.getImgURL()
        );
    }


}
