package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m14  reason: default package */
/* loaded from: classes.dex */
public final class m14 extends l0 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ m14(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.l0
    public final int a() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((n14) obj).a.groupCount() + 1;
            default:
                yv4 yv4Var = (yv4) obj;
                yv4Var.getClass();
                return yv4Var.B;
        }
    }

    public k14 b(int i) {
        Matcher matcher = ((n14) this.B).a;
        l93 R = gi2.R(matcher.start(i), matcher.end(i));
        if (R.A >= 0) {
            String group = matcher.group(i);
            group.getClass();
            return new k14(group, R);
        }
        return null;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z;
        switch (this.A) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof k14;
                }
                if (!z) {
                    return false;
                }
                return super.contains((k14) obj);
            default:
                return ((yv4) this.B).containsValue(obj);
        }
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
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
                return new r97(new qd2(new ev(new j93(0, size() - 1, 1), 1), new bg2(this, 11), 2));
            default:
                ac7 ac7Var = ((yv4) this.B).A;
                bc7[] bc7VarArr = new bc7[8];
                for (int i = 0; i < 8; i++) {
                    bc7VarArr[i] = new cc7(2);
                }
                return new zv4(ac7Var, bc7VarArr);
        }
    }
}
