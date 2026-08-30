package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s84  reason: default package */
/* loaded from: classes.dex */
public final class s84 implements ez6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ s84(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                if (n07Var.a != Number.class) {
                    return null;
                }
                return (u84) obj;
            case 1:
                if (n07Var.a != Object.class) {
                    return null;
                }
                return new f94(qo2Var, (xt6) obj);
            default:
                Class cls = n07Var.a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (u53) obj;
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((u53) this.B) + "]";
            default:
                return super.toString();
        }
    }
}
