package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw4  reason: default package */
/* loaded from: classes.dex */
public final class fw4 extends s1 implements s33 {
    public final /* synthetic */ int A;
    public final yv4 B;

    public /* synthetic */ fw4(yv4 yv4Var, int i) {
        this.A = i;
        this.B = yv4Var;
    }

    @Override // defpackage.l0
    public final int a() {
        int i = this.A;
        yv4 yv4Var = this.B;
        switch (i) {
            case 0:
                yv4Var.getClass();
                return yv4Var.B;
            default:
                yv4Var.getClass();
                return yv4Var.B;
        }
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.A;
        yv4 yv4Var = this.B;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = yv4Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !yv4Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return yv4Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                ac7 ac7Var = this.B.A;
                bc7[] bc7VarArr = new bc7[8];
                for (int i = 0; i < 8; i++) {
                    bc7VarArr[i] = new cc7(0);
                }
                return new zv4(ac7Var, bc7VarArr);
            default:
                ac7 ac7Var2 = this.B.A;
                bc7[] bc7VarArr2 = new bc7[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bc7VarArr2[i2] = new cc7(1);
                }
                return new zv4(ac7Var2, bc7VarArr2);
        }
    }
}
