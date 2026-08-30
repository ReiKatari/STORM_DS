package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g12  reason: default package */
/* loaded from: classes.dex */
public final class g12 implements m93 {
    public final Enum[] a;
    public final il6 b;

    public g12(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new il6(new p6(29, this, str));
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        int c0 = b91Var.c0(e());
        Enum[] enumArr = this.a;
        if (c0 >= 0 && c0 < enumArr.length) {
            return enumArr[c0];
        }
        String b = e().b();
        int length = enumArr.length;
        throw new IllegalArgumentException(c0 + " is not among valid " + b + " enum values, values size is " + length);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int w0 = nu.w0(enumArr, r5);
        if (w0 != -1) {
            mz1Var.g0(e(), w0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String b = e().b();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(b);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return (h06) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + e().b() + '>';
    }
}
