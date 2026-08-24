package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a55  reason: default package */
/* loaded from: classes.dex */
public class a55 extends f55 implements sc1, ux0 {
    public final o45 L;
    public final e55 R;
    public final wb6 X;
    public final int[] Y;
    public HashMap Z;
    public HashMap d0;
    public boolean e0;
    public final ls1 f0;

    public a55(o45 o45Var, e55 e55Var, wb6 wb6Var) {
        wb6Var.getClass();
        this.L = o45Var;
        this.R = e55Var;
        this.X = wb6Var;
        this.f0 = new ls1(wb6Var, new h4(2, this, a55.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 7));
        int f = wb6Var.f();
        if (f < 32) {
            int i = f + 1;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = -1;
            }
            for (int i3 = 0; i3 < f; i3++) {
                int u = mp2.u(wb6Var, i3, false);
                if (u <= f && u != -2) {
                    iArr[u] = i3;
                } else {
                    y0(wb6Var, f);
                    return;
                }
            }
            this.Y = iArr;
            return;
        }
        y0(wb6Var, f);
    }

    @Override // defpackage.ux0
    public final String A(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return u0(x0(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final int B() {
        return s0(m0());
    }

    @Override // defpackage.ux0
    public final short C(t25 t25Var, int i) {
        t25Var.getClass();
        return (short) s0(x0(t25Var, i));
    }

    @Override // defpackage.sc1
    public final sc1 F(wb6 wb6Var) {
        wb6Var.getClass();
        n0(m0());
        return this;
    }

    @Override // defpackage.ux0
    public final Object G(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        n0(x0(wb6Var, i));
        return o0(gg3Var, obj);
    }

    @Override // defpackage.ux0
    public final int H(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return s0(x0(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final String I() {
        return u0(m0());
    }

    @Override // defpackage.sc1
    public final int J(wb6 wb6Var) {
        wb6Var.getClass();
        int s0 = s0(m0());
        if (s0 < wb6Var.f() && s0 >= 0 && mp2.u(wb6Var, s0, true) == s0) {
            return s0;
        }
        int f = wb6Var.f();
        for (int i = 0; i < f; i++) {
            if (mp2.u(wb6Var, i, true) == s0) {
                return i;
            }
        }
        String a = this.X.a();
        throw new IllegalArgumentException(s0 + " is not among valid " + a + " enum proto numbers", null);
    }

    @Override // defpackage.sc1
    public final long L() {
        return t0(m0());
    }

    @Override // defpackage.sc1
    public final boolean M() {
        return !this.e0;
    }

    @Override // defpackage.ux0
    public final Object P(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        n0(x0(wb6Var, i));
        if (!this.e0) {
            return o0(gg3Var, obj);
        }
        return null;
    }

    @Override // defpackage.ux0
    public final boolean W(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return p0(x0(wb6Var, i));
    }

    @Override // defpackage.sc1
    public final byte Y() {
        return (byte) s0(m0());
    }

    @Override // defpackage.sc1
    public final short Z() {
        return (short) s0(m0());
    }

    @Override // defpackage.ux0
    public final void a(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.ux0
    public final jd1 b() {
        return this.L.b;
    }

    @Override // defpackage.sc1
    public final float b0() {
        return r0(m0());
    }

    @Override // defpackage.sc1
    public ux0 c(wb6 wb6Var) {
        np2 e;
        bt6 bt6Var;
        boolean k;
        o45 o45Var;
        e55 e55Var;
        Integer num;
        r90 d;
        wb6 wb6Var2 = this.X;
        wb6Var.getClass();
        try {
            e = wb6Var.e();
            bt6Var = bt6.f;
            k = nb3.k(e, bt6Var);
            o45Var = this.L;
            e55Var = this.R;
        } catch (b55 e2) {
            e = e2;
        }
        try {
            if (k) {
                long h0 = h0();
                if (nb3.k(wb6Var2.e(), bt6Var) && h0 != 19500 && !wb6Var2.equals(wb6Var)) {
                    e55 k2 = uj2.k(e55Var, h0);
                    k2.l();
                    return new ek5(o45Var, k2, 1 | q45.DEFAULT.getSignature$kotlinx_serialization_protobuf(), wb6Var);
                } else if (e55Var.c == x45.SIZE_DELIMITED && mp2.O(wb6Var.j(0))) {
                    return new a55(o45Var, new e55(e55Var.d()), wb6Var);
                } else {
                    return new ek5(o45Var, e55Var, h0, wb6Var);
                }
            } else if (!nb3.k(e, bt6.e) && !nb3.k(e, bt6.h) && !(e instanceof dz4)) {
                if (nb3.k(e, bt6.g)) {
                    if (h0() == 19500) {
                        d = e55Var.e();
                    } else {
                        d = e55Var.d();
                    }
                    return new u04(o45Var, new e55(d), h0(), wb6Var);
                }
                throw new IllegalArgumentException("Primitives are not supported at top-level");
            } else {
                long h02 = h0();
                if (h02 == 19500 && nb3.k(wb6Var2, wb6Var)) {
                    return this;
                }
                if (mp2.N(h02)) {
                    int i = ((int) (h02 & 2147483647L)) - 1;
                    HashMap hashMap = this.d0;
                    if (hashMap != null && (num = (Integer) hashMap.get(Integer.valueOf(i))) != null) {
                        h02 = (h02 & 1152921500311879680L) | num.intValue();
                    }
                    return new em4(o45Var, e55Var, h02, wb6Var);
                }
                return new a55(o45Var, uj2.k(e55Var, h02), wb6Var);
            }
        } catch (b55 e3) {
            e = e3;
            throw new IllegalArgumentException("Fail to begin structure for " + wb6Var.a() + " in " + wb6Var2.a() + " at proto number " + ((int) (2147483647L & h0())), e);
        }
    }

    @Override // defpackage.ux0
    public final long c0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return t0(x0(wb6Var, i));
    }

    @Override // defpackage.ux0
    public final sc1 e(t25 t25Var, int i) {
        t25Var.getClass();
        long x0 = x0(t25Var, i);
        t25Var.j(i).getClass();
        n0(x0);
        return this;
    }

    @Override // defpackage.sc1
    public final double e0() {
        return q0(m0());
    }

    @Override // defpackage.sc1
    public final boolean g() {
        return p0(m0());
    }

    @Override // defpackage.sc1
    public final char h() {
        return (char) s0(m0());
    }

    @Override // defpackage.sc1
    public final Object k(gg3 gg3Var) {
        gg3Var.getClass();
        return o0(gg3Var, null);
    }

    public final Object o0(gg3 gg3Var, Object obj) {
        String str;
        String str2;
        byte[] bArr;
        bt6 bt6Var = bt6.g;
        gg3Var.getClass();
        try {
            if (gg3Var instanceof qw2) {
                return w0(gg3Var, obj);
            }
            if (nb3.k(gg3Var.e(), x90.c.b)) {
                return v0((byte[]) obj);
            }
            if (nb3.k(gg3Var.e(), cf7.c.b)) {
                af7 af7Var = (af7) obj;
                byte[] bArr2 = null;
                if (af7Var != null) {
                    bArr = af7Var.A;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    bArr2 = bArr;
                }
                return new af7(v0(bArr2));
            } else if (gg3Var instanceof m0) {
                return ((m0) gg3Var).j(this, obj);
            } else {
                return gg3Var.c(this);
            }
        } catch (b55 e) {
            long h0 = h0();
            wb6 e2 = gg3Var.e();
            wb6 wb6Var = this.X;
            if (!nb3.k(wb6Var, e2)) {
                if (nb3.k(wb6Var.e(), bt6.f) && !nb3.k(gg3Var.e().e(), bt6Var)) {
                    StringBuilder sb = new StringBuilder("Error while decoding index ");
                    sb.append(((int) (h0 & 2147483647L)) - 1);
                    sb.append(" in repeated field of ");
                    sb.append(gg3Var.e().a());
                    str = sb.toString();
                } else if (nb3.k(wb6Var.e(), bt6Var)) {
                    int i = ((int) (h0 & 2147483647L)) - 1;
                    int i2 = i / 2;
                    if (i % 2 == 0) {
                        str2 = "key";
                    } else {
                        str2 = "value";
                    }
                    str = "Error while decoding " + str2 + " of index " + i2 + " in map field of " + gg3Var.e().a();
                } else {
                    str = "Error while decoding " + gg3Var.e().a() + " at proto number " + ((int) (h0 & 2147483647L)) + " of " + wb6Var.a();
                }
            } else {
                str = "Error while decoding " + wb6Var.a();
            }
            throw new IllegalArgumentException(str, e);
        }
    }

    @Override // defpackage.ux0
    public final float p(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return r0(x0(wb6Var, i));
    }

    public final boolean p0(long j) {
        int s0 = s0(j);
        if (s0 != 0) {
            if (s0 == 1) {
                return true;
            }
            throw new IllegalArgumentException(lb1.g(s0, "Unexpected boolean value: "));
        }
        return false;
    }

    @Override // defpackage.ux0
    public int q(wb6 wb6Var) {
        int intValue;
        HashMap hashMap;
        e55 e55Var = this.R;
        wb6Var.getClass();
        while (true) {
            try {
                int l = e55Var.l();
                ls1 ls1Var = this.f0;
                if (l == -1) {
                    return ls1Var.b();
                }
                if (l != 0) {
                    int[] iArr = this.Y;
                    if (iArr != null) {
                        if (l >= 0 && l < iArr.length) {
                            intValue = iArr[l];
                        } else {
                            intValue = -1;
                        }
                    } else {
                        HashMap hashMap2 = this.Z;
                        hashMap2.getClass();
                        int i = hashMap2.get(Integer.valueOf(l));
                        if (i == null) {
                            i = -1;
                        }
                        intValue = ((Number) i).intValue();
                    }
                    if (intValue == -1) {
                        e55Var.m();
                    } else {
                        if (mp2.N(mp2.t(wb6Var, intValue)) && (hashMap = this.d0) != null) {
                            Integer num = (Integer) hashMap.put(Integer.valueOf(intValue), Integer.valueOf(l));
                        }
                        ls1Var.a(intValue);
                        return intValue;
                    }
                } else {
                    throw new IllegalArgumentException("0 is not allowed as the protobuf field number in " + wb6Var.a() + ", the input bytes may have been corrupted");
                }
            } catch (b55 e) {
                throw new IllegalArgumentException("Fail to get element index for " + wb6Var.a() + " in " + this.X.a(), e);
            }
        }
    }

    public final double q0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                return Double.longBitsToDouble(e55Var.j());
            }
            x45 x45Var = x45.i64;
            if (e55Var.c == x45Var) {
                return Double.longBitsToDouble(e55Var.j());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(x45Var);
            u34.z(sb, e55Var.c);
            return 0.0d;
        } catch (b55 e) {
            u34.d((int) (j & 2147483647L), this.X.a(), e);
            return 0.0d;
        }
    }

    public final float r0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                return Float.intBitsToFloat(e55Var.h());
            }
            x45 x45Var = x45.i32;
            if (e55Var.c == x45Var) {
                return Float.intBitsToFloat(e55Var.h());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(x45Var);
            u34.z(sb, e55Var.c);
            return RecyclerView.B1;
        } catch (b55 e) {
            u34.d((int) (j & 2147483647L), this.X.a(), e);
            return RecyclerView.B1;
        }
    }

    public final int s0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                return e55Var.b(q45.DEFAULT);
            }
            return e55Var.g(mp2.I(j));
        } catch (b55 e) {
            u34.d((int) (j & 2147483647L), this.X.a(), e);
            return 0;
        }
    }

    @Override // defpackage.ux0
    public final double t(t25 t25Var, int i) {
        t25Var.getClass();
        return q0(x0(t25Var, i));
    }

    public final long t0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                return e55Var.c(q45.DEFAULT);
            }
            return e55Var.i(mp2.I(j));
        } catch (b55 e) {
            u34.d((int) (j & 2147483647L), this.X.a(), e);
            return 0L;
        }
    }

    public String u0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                int b = e55Var.b(q45.DEFAULT);
                e55.a(b);
                r90 r90Var = e55Var.a;
                int i2 = r90Var.B;
                String W = xs6.W(i2, (byte[]) r90Var.L, i2 + b, 4);
                r90Var.B += b;
                return W;
            }
            return e55Var.k();
        } catch (b55 e) {
            u34.d((int) (j & 2147483647L), this.X.a(), e);
            return null;
        }
    }

    @Override // defpackage.ux0
    public final char v(t25 t25Var, int i) {
        t25Var.getClass();
        return (char) s0(x0(t25Var, i));
    }

    public final byte[] v0(byte[] bArr) {
        byte[] bArr2;
        long h0 = h0();
        int i = (h0 > 19500L ? 1 : (h0 == 19500L ? 0 : -1));
        byte[] bArr3 = null;
        e55 e55Var = this.R;
        try {
            if (i == 0) {
                bArr2 = e55Var.f();
            } else {
                x45 x45Var = x45.SIZE_DELIMITED;
                if (e55Var.c == x45Var) {
                    bArr3 = e55Var.f();
                } else {
                    StringBuilder sb = new StringBuilder("Expected wire type ");
                    sb.append(x45Var);
                    u34.z(sb, e55Var.c);
                }
                bArr2 = bArr3;
            }
            if (bArr == null) {
                return bArr2;
            }
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        } catch (b55 e) {
            u34.d((int) (h0 & 2147483647L), this.X.a(), e);
            return null;
        }
    }

    public final LinkedHashMap w0(gg3 gg3Var, Object obj) {
        Map map;
        gg3Var.getClass();
        qw2 qw2Var = (qw2) gg3Var;
        gg3 gg3Var2 = qw2Var.a;
        gg3 gg3Var3 = qw2Var.b;
        gg3Var2.getClass();
        gg3Var3.getClass();
        w04 w04Var = new w04(gg3Var2, gg3Var3, 0);
        Set set = null;
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map != null) {
            set = map.entrySet();
        }
        Set<Map.Entry> set2 = (Set) new ru(w04Var, 2).j(this, set);
        int k0 = c14.k0(ht0.v0(set2, 10));
        if (k0 < 16) {
            k0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
        for (Map.Entry entry : set2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public long x0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        return mp2.t(wb6Var, i);
    }

    public final void y0(wb6 wb6Var, int i) {
        HashMap hashMap = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (mp2.u(wb6Var, i3, false) == -2) {
                List<wb6> y = mp2.y(wb6Var.j(i3), this.L.b);
                ArrayList arrayList = new ArrayList(ht0.v0(y, 10));
                for (wb6 wb6Var2 : y) {
                    arrayList.add(Integer.valueOf((int) (mp2.t(wb6Var2, 0) & 2147483647L)));
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    hashMap.put(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                hashMap.put(Integer.valueOf(mp2.u(wb6Var, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.d0 = new HashMap(i2, 1.0f);
        }
        this.Z = hashMap;
    }

    @Override // defpackage.ux0
    public final byte z(t25 t25Var, int i) {
        t25Var.getClass();
        return (byte) s0(x0(t25Var, i));
    }
}
