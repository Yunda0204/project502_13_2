package org.choongang.template.member;

import org.choongang.template.Template;
import org.choongang.template.Templates;

public class MypageTpl implements Template {
    @Override
    public String getTpl() {

        StringBuffer sb = new StringBuffer(1000);
        sb.append("윤다은\n");
        sb.append("미구현 이진표 도선화 채도아\n");
        sb.append(Templates.getInstance().yunda03());
        return sb.toString();
    }
}
