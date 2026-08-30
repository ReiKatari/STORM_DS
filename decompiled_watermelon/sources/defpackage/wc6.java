package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wc6  reason: default package */
/* loaded from: classes.dex */
public class wc6 implements ez6 {
    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        if (n07Var.a == Timestamp.class) {
            qo2Var.getClass();
            return new xc6(qo2Var.d(new n07(Date.class)));
        }
        return null;
    }
}
