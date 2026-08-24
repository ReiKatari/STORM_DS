package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl6  reason: default package */
/* loaded from: classes.dex */
public final class yl6 extends dm5 implements eo2 {
    public long[] L;
    public int R;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ zl6 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl6(zl6 zl6Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = zl6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((yl6) q((r41) obj2, (rb6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        yl6 yl6Var = new yl6(this.d0, r41Var);
        yl6Var.Z = obj;
        return yl6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r14.c(r22, r15) == r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r9.c(r22, r12) == r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r6.c(r22, r7) == r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:30:0x00a9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ac -> B:30:0x00a9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d9 -> B:42:0x00dc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00df -> B:42:0x00dc). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        rb6 rb6Var;
        long[] jArr;
        int length;
        rb6 rb6Var2;
        int i;
        int i2;
        rb6 rb6Var3;
        int i3;
        zl6 zl6Var = this.d0;
        long j = zl6Var.A;
        long j2 = zl6Var.L;
        long j3 = zl6Var.B;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i4 = this.Y;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        i3 = this.R;
                        rb6Var3 = (rb6) this.Z;
                        oi2.Y(obj);
                        i3++;
                        if (i3 < 64) {
                            if (((1 << i3) & j) != 0) {
                                Long l = new Long(i3 + j2 + 64);
                                this.Z = rb6Var3;
                                this.L = null;
                                this.R = i3;
                                this.Y = 3;
                            }
                            i3++;
                            if (i3 < 64) {
                            }
                        }
                        return jg7.a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.R;
                rb6Var = (rb6) this.Z;
                oi2.Y(obj);
                i2++;
                if (i2 < 64) {
                    if (((1 << i2) & j3) != 0) {
                        Long l2 = new Long(i2 + j2);
                        this.Z = rb6Var;
                        this.L = null;
                        this.R = i2;
                        this.Y = 2;
                    }
                    i2++;
                    if (i2 < 64) {
                    }
                }
                if (j != 0) {
                    rb6Var3 = rb6Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return jg7.a;
            }
            length = this.X;
            i = this.R;
            jArr = this.L;
            rb6Var2 = (rb6) this.Z;
            oi2.Y(obj);
            int i5 = 1;
            i += i5;
            if (i >= length) {
                Long l3 = new Long(jArr[i]);
                this.Z = rb6Var2;
                this.L = jArr;
                this.R = i;
                this.X = length;
                i5 = 1;
                this.Y = 1;
            } else {
                rb6Var = rb6Var2;
                if (j3 != 0) {
                    i2 = 0;
                    if (i2 < 64) {
                    }
                }
                if (j != 0) {
                }
                return jg7.a;
            }
        } else {
            oi2.Y(obj);
            rb6Var = (rb6) this.Z;
            long[] jArr2 = zl6Var.R;
            if (jArr2 != null) {
                jArr = jArr2;
                length = jArr2.length;
                rb6Var2 = rb6Var;
                i = 0;
                if (i >= length) {
                }
            }
            if (j3 != 0) {
            }
            if (j != 0) {
            }
            return jg7.a;
        }
    }
}
