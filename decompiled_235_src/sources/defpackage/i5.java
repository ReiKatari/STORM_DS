package defpackage;

import java.io.IOException;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i5  reason: default package */
/* loaded from: classes.dex */
public final class i5 implements on2 {
    public final /* synthetic */ int A;
    public final Object B;
    public final /* synthetic */ Object L;

    public i5(qz2 qz2Var, tz2 tz2Var) {
        this.A = 7;
        this.L = qz2Var;
        this.B = tz2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((qn2) obj2).g(obj);
                return jg7Var;
            case 1:
                ((qa4) obj).setValue((ta5) obj2);
                return jg7Var;
            case 2:
                ((qn2) obj2).g(Long.valueOf(((c6) obj).a));
                return jg7Var;
            case 3:
                ((qa4) obj).setValue(new gn0((Cheat) obj2));
                return jg7Var;
            case 4:
                ((qn2) obj2).g((co0) obj);
                return jg7Var;
            case 5:
                ((qn2) obj2).g((an0) obj);
                return jg7Var;
            case 6:
                ((qn2) obj2).g((cp2) obj);
                return jg7Var;
            case 7:
                qz2 qz2Var = (qz2) obj;
                tz2 tz2Var = (tz2) obj2;
                a62 a62Var = a62.INTERNAL_ERROR;
                IOException iOException = null;
                try {
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        iOException = e;
                    }
                    if (tz2Var.e(true, this)) {
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                this = a62Var;
                                qz2Var.e(this, a62Var, iOException);
                                yy7.b(tz2Var);
                                throw th;
                            }
                        } while (tz2Var.e(false, this));
                        a62 a62Var2 = a62.NO_ERROR;
                        try {
                            a62Var = a62.CANCEL;
                            qz2Var.e(a62Var2, a62Var, null);
                            this = a62Var2;
                        } catch (IOException e2) {
                            iOException = e2;
                            a62 a62Var3 = a62.PROTOCOL_ERROR;
                            qz2Var.e(a62Var3, a62Var3, iOException);
                            this = a62Var3;
                            yy7.b(tz2Var);
                            return jg7Var;
                        }
                        yy7.b(tz2Var);
                        return jg7Var;
                    }
                    throw new IOException("Required SETTINGS preface not received");
                } catch (Throwable th3) {
                    th = th3;
                }
            case 8:
                ((qn2) obj2).g((qe4) obj);
                return jg7Var;
            case 9:
                ((qn2) obj2).g((RewindSaveState) obj);
                return jg7Var;
            case 10:
                ((qn2) obj2).g((qw5) obj);
                return jg7Var;
            case 11:
                ((qn2) obj2).g((gn6) obj);
                return jg7Var;
            case 12:
                ((qn2) obj2).g((lr5) obj);
                return jg7Var;
            default:
                ((qn2) obj2).g((hm4) obj);
                return jg7Var;
        }
    }

    public /* synthetic */ i5(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
