package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc6  reason: default package */
/* loaded from: classes.dex */
public final class xc6 extends dz6 {
    public static final wc6 b = new wc6();
    public final dz6 a;

    public xc6(dz6 dz6Var) {
        this.a = dz6Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        Date date = (Date) this.a.b(o83Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        this.a.c(b93Var, (Timestamp) obj);
    }
}
