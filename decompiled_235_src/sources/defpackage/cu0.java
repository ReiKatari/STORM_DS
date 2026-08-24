package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu0  reason: default package */
/* loaded from: classes.dex */
public final class cu0 extends hw6 implements eo2 {
    public ul0 X;
    public byte[] Y;
    public int Z;
    public int d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ le2[] g0;
    public final /* synthetic */ on2 h0;
    public final /* synthetic */ fo2 i0;
    public final /* synthetic */ ne2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(r41 r41Var, ne2 ne2Var, on2 on2Var, fo2 fo2Var, le2[] le2VarArr) {
        super(2, r41Var);
        this.g0 = le2VarArr;
        this.h0 = on2Var;
        this.i0 = fo2Var;
        this.j0 = ne2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((cu0) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        cu0 cu0Var = new cu0(r41Var, this.j0, this.h0, this.i0, this.g0);
        cu0Var.f0 = obj;
        return cu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
        if (r14.e(r13, r10, r19) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
        if (r14.e(r13, r12, r19) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:26:0x00a4->B:32:0x00c1, LOOP_START, PHI: r7 r12 
      PHI: (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:23:0x009f, B:32:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v4 j43) = (r12v3 j43), (r12v15 j43) binds: [B:23:0x009f, B:32:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v3, types: [ul0] */
    /* JADX WARN: Type inference failed for: r10v5, types: [ul0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c3 -> B:19:0x0084). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e3 -> B:19:0x0084). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fb -> B:19:0x0084). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object[] objArr;
        byte[] bArr;
        byte b;
        int i;
        v80 v80Var;
        Object obj2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.e0;
        gr1 gr1Var = fh4.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r2 = this.d0;
                i = this.Z;
                byte[] bArr2 = this.Y;
                ?? r10 = this.X;
                Object[] objArr2 = (Object[]) this.f0;
                oi2.Y(obj);
                b = r2;
                bArr = bArr2;
                v80Var = r10;
                objArr = objArr2;
            } else {
                ?? r22 = this.d0;
                i = this.Z;
                byte[] bArr3 = this.Y;
                ?? r102 = this.X;
                Object[] objArr3 = (Object[]) this.f0;
                oi2.Y(obj);
                obj2 = ((gm0) obj).a;
                b = r22;
                bArr = bArr3;
                v80Var = r102;
                objArr = objArr3;
                j43 j43Var = (j43) gm0.a(obj2);
                if (j43Var != null) {
                    do {
                        int i3 = j43Var.a;
                        Object obj3 = objArr[i3];
                        objArr[i3] = j43Var.b;
                        if (obj3 == gr1Var) {
                            i--;
                        }
                        if (bArr[i3] == b) {
                            break;
                        }
                        bArr[i3] = b;
                        j43Var = (j43) gm0.a(v80Var.m());
                    } while (j43Var != null);
                    if (i == 0) {
                        Object[] objArr4 = (Object[]) this.h0.c();
                        ne2 ne2Var = this.j0;
                        fo2 fo2Var = this.i0;
                        if (objArr4 == null) {
                            this.f0 = objArr;
                            this.X = v80Var;
                            this.Y = bArr;
                            this.Z = i;
                            this.d0 = b;
                            this.e0 = 2;
                        } else {
                            fv.w0(objArr, objArr4, 0, 0, 14);
                            this.f0 = objArr;
                            this.X = v80Var;
                            this.Y = bArr;
                            this.Z = i;
                            this.d0 = b;
                            this.e0 = 3;
                        }
                        j43 j43Var2 = (j43) gm0.a(obj2);
                        if (j43Var2 != null) {
                        }
                    }
                }
                return jg7.a;
            }
        } else {
            oi2.Y(obj);
            w61 w61Var = (w61) this.f0;
            int length = this.g0.length;
            if (length != 0) {
                objArr = new Object[length];
                fv.z0(0, length, gr1Var, objArr);
                v80 c = nb3.c(length, null, null, 6);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i4 = 0; i4 < length; i4++) {
                    hv.L(w61Var, null, null, new m7(this.g0, i4, atomicInteger, c, null), 3);
                }
                bArr = new byte[length];
                b = 0;
                i = length;
                v80Var = c;
            }
            return jg7.a;
        }
        b = (byte) (b + 1);
        this.f0 = objArr;
        this.X = v80Var;
        this.Y = bArr;
        this.Z = i;
        this.d0 = b;
        this.e0 = 1;
        obj2 = v80Var.p(this);
    }
}
