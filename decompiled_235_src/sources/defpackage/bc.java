package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eo2 B;

    public /* synthetic */ bc(int i, eo2 eo2Var) {
        this.A = i;
        this.B = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        float f;
        float f2;
        boolean z;
        boolean z2;
        q46 q46Var;
        boolean z3;
        boolean z4;
        int i = this.A;
        boolean z5 = false;
        boolean z6 = false;
        jg7 jg7Var = jg7.a;
        eo2 eo2Var = this.B;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z5)) {
                    py0 py0Var = g31.a;
                    long j = ((kt0) xq2Var.j(j31.a)).a;
                    if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                        f = 1.0f;
                    } else {
                        f = 0.87f;
                    }
                    hv.d(py0Var.a(Float.valueOf(f)), n16.I(-1654653485, new bc(3, eo2Var), xq2Var), xq2Var, 56);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z6 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z6)) {
                    py0 py0Var2 = g31.a;
                    long j2 = ((kt0) xq2Var2.j(j31.a)).a;
                    if (!((ut0) xq2Var2.j(vt0.a)).k() ? hv.N(j2) < 0.5d : hv.N(j2) > 0.5d) {
                        f2 = 0.74f;
                    } else {
                        f2 = 0.6f;
                    }
                    hv.d(py0Var2.a(Float.valueOf(f2)), n16.I(-2126650894, new bc(2, eo2Var), xq2Var2), xq2Var2, 56);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z)) {
                    x37.a(((xe7) xq2Var3.j(ye7.b)).j, eo2Var, xq2Var3, 0);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z2)) {
                    x37.a(((xe7) xq2Var4.j(ye7.b)).g, eo2Var, xq2Var4, 0);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                File file = (File) obj;
                Object obj3 = (IOException) obj2;
                file.getClass();
                obj3.getClass();
                if (eo2Var.o(file, obj3) != nl4.TERMINATE) {
                    return jg7Var;
                }
                throw new gb2(file, null, null);
            case 5:
                n46 n46Var = (n46) obj;
                List list = (List) eo2Var.o(n46Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list.get(i2);
                    if (obj4 != null && (q46Var = n46Var.B) != null && !q46Var.c(obj4)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj4).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 6:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z3)) {
                    eo2Var.o(xq2Var5, 0);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 7:
                Object obj5 = (String) obj;
                obj5.getClass();
                eo2Var.o(obj5, (String) obj2);
                return jg7Var;
            default:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z4)) {
                    x37.a(s47.a(((xe7) xq2Var6.j(ye7.b)).k, 0L, 0L, null, null, 0L, 0L, null, 16744447), eo2Var, xq2Var6, 0);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
        }
    }
}
