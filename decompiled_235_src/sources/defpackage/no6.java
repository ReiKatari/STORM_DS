package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no6  reason: default package */
/* loaded from: classes.dex */
public final class no6 extends yc7 {
    public static final mo6 b = new mo6();
    public final yc7 a;

    public no6(yc7 yc7Var) {
        this.a = yc7Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        Date date = (Date) this.a.b(hf3Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        this.a.c(vf3Var, (Timestamp) obj);
    }
}
