package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v52  reason: default package */
/* loaded from: classes.dex */
public final class v52 implements gg3 {
    public final Enum[] a;
    public final ex6 b;

    public v52(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new ex6(new q6(29, this, str));
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        int J = sc1Var.J(e());
        Enum[] enumArr = this.a;
        if (J >= 0 && J < enumArr.length) {
            return enumArr[J];
        }
        String a = e().a();
        int length = enumArr.length;
        throw new IllegalArgumentException(J + " is not among valid " + a + " enum values, values size is " + length);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int K0 = fv.K0(enumArr, r5);
        if (K0 != -1) {
            x32Var.K(e(), K0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String a = e().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(a);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return (wb6) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + e().a() + '>';
    }
}
