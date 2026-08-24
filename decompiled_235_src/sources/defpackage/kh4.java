package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh4  reason: default package */
/* loaded from: classes.dex */
public final class kh4 implements zc7 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ kh4(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                if (ie7Var.a != Number.class) {
                    return null;
                }
                return (mh4) obj;
            case 1:
                if (ie7Var.a != Object.class) {
                    return null;
                }
                return new yh4(su2Var, (o67) obj);
            default:
                Class cls = ie7Var.a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (ic3) obj;
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((ic3) this.B) + "]";
            default:
                return super.toString();
        }
    }
}
