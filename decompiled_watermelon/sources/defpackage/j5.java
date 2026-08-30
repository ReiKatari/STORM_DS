package defpackage;

import java.io.IOException;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j5  reason: default package */
/* loaded from: classes.dex */
public final class j5 implements ki2 {
    public final /* synthetic */ int A;
    public final Object B;
    public final /* synthetic */ Object L;

    public j5(pt2 pt2Var, st2 st2Var) {
        this.A = 7;
        this.L = pt2Var;
        this.B = st2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((mi2) obj2).n(obj);
                return o27Var;
            case 1:
                ((k24) obj).setValue((j15) obj2);
                return o27Var;
            case 2:
                ((mi2) obj2).n(Long.valueOf(((c6) obj).a));
                return o27Var;
            case 3:
                ((k24) obj).setValue(new yk0((Cheat) obj2));
                return o27Var;
            case 4:
                ((mi2) obj2).n((ul0) obj);
                return o27Var;
            case 5:
                ((mi2) obj2).n((sk0) obj);
                return o27Var;
            case ig7.b /* 6 */:
                ((mi2) obj2).n((yj2) obj);
                return o27Var;
            case 7:
                pt2 pt2Var = (pt2) obj;
                st2 st2Var = (st2) obj2;
                l12 l12Var = l12.INTERNAL_ERROR;
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
                    if (st2Var.d(true, this)) {
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                this = l12Var;
                                pt2Var.d(this, l12Var, iOException);
                                gk7.b(st2Var);
                                throw th;
                            }
                        } while (st2Var.d(false, this));
                        l12 l12Var2 = l12.NO_ERROR;
                        try {
                            l12Var = l12.CANCEL;
                            pt2Var.d(l12Var2, l12Var, null);
                            this = l12Var2;
                        } catch (IOException e2) {
                            iOException = e2;
                            l12 l12Var3 = l12.PROTOCOL_ERROR;
                            pt2Var.d(l12Var3, l12Var3, iOException);
                            this = l12Var3;
                            gk7.b(st2Var);
                            return o27Var;
                        }
                        gk7.b(st2Var);
                        return o27Var;
                    }
                    throw new IOException("Required SETTINGS preface not received");
                } catch (Throwable th3) {
                    th = th3;
                }
            case 8:
                ((mi2) obj2).n((RewindSaveState) obj);
                return o27Var;
            case 9:
                ((mi2) obj2).n((bm5) obj);
                return o27Var;
            case 10:
                ((mi2) obj2).n((qb6) obj);
                return o27Var;
            default:
                ((mi2) obj2).n((jh5) obj);
                return o27Var;
        }
    }

    public /* synthetic */ j5(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
