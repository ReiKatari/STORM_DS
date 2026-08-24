package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc4  reason: default package */
/* loaded from: classes.dex */
public final class yc4 extends hw6 implements eo2 {
    public final /* synthetic */ ga7 X;
    public final /* synthetic */ rc4 Y;
    public final /* synthetic */ sb4 Z;
    public final /* synthetic */ x94 d0;
    public final /* synthetic */ pp6 e0;
    public final /* synthetic */ uw0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc4(ga7 ga7Var, rc4 rc4Var, sb4 sb4Var, x94 x94Var, pp6 pp6Var, uw0 uw0Var, r41 r41Var) {
        super(2, r41Var);
        this.X = ga7Var;
        this.Y = rc4Var;
        this.Z = sb4Var;
        this.d0 = x94Var;
        this.e0 = pp6Var;
        this.f0 = uw0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((yc4) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new yc4(this.X, this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        ga7 ga7Var = this.X;
        Object f = ga7Var.a.f();
        vs4 vs4Var = ga7Var.d;
        if (nb3.k(f, vs4Var.getValue()) && (((sb4) this.Y.b.f.h()) == null || nb3.k(vs4Var.getValue(), this.Z))) {
            for (sb4 sb4Var : (List) this.e0.getValue()) {
                this.f0.b().c(sb4Var);
            }
            x94 x94Var = this.d0;
            long[] jArr = x94Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = x94Var.b[i4];
                                float f2 = x94Var.c[i4];
                                if (!nb3.k((String) obj2, ((sb4) vs4Var.getValue()).Y)) {
                                    x94Var.e--;
                                    long[] jArr2 = x94Var.a;
                                    int i5 = x94Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    x94Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return jg7.a;
    }
}
