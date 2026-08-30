package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ju3  reason: default package */
/* loaded from: classes.dex */
public final class ju3 extends k0 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ ju3(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.k0
    public final int b() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ku3) obj).a.groupCount() + 1;
            default:
                tm4 tm4Var = (tm4) obj;
                tm4Var.getClass();
                return tm4Var.B;
        }
    }

    public hu3 c(int i) {
        Matcher matcher = ((ku3) this.B).a;
        d33 t0 = io2.t0(matcher.start(i), matcher.end(i));
        if (t0.A >= 0) {
            String group = matcher.group(i);
            group.getClass();
            return new hu3(group, t0);
        }
        return null;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        switch (this.A) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof hu3;
                }
                if (!z) {
                    return false;
                }
                return super.contains((hu3) obj);
            default:
                return ((tm4) this.B).containsValue(obj);
        }
    }

    @Override // defpackage.k0, java.util.Collection
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new vw6(new y82(new mu(1, new b33(0, size() - 1, 1)), new kb2(11, this), 2));
            default:
                fy6 fy6Var = ((tm4) this.B).A;
                gy6[] gy6VarArr = new gy6[8];
                for (int i = 0; i < 8; i++) {
                    gy6VarArr[i] = new hy6(2);
                }
                return new um4(fy6Var, gy6VarArr);
        }
    }
}
