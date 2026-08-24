package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo6  reason: default package */
/* loaded from: classes.dex */
public class mo6 implements zc7 {
    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        if (ie7Var.a == Timestamp.class) {
            su2Var.getClass();
            return new no6(su2Var.d(new ie7(Date.class)));
        }
        return null;
    }
}
