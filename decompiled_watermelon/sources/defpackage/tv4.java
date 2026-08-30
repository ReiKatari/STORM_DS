package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv4  reason: default package */
/* loaded from: classes.dex */
public class tv4 extends yv4 implements b91, yu0 {
    public final hv4 L;
    public final xv4 R;
    public final h06 X;
    public final int[] Y;
    public HashMap Z;
    public HashMap c0;
    public boolean d0;
    public final bo1 e0;

    public tv4(hv4 hv4Var, xv4 xv4Var, h06 h06Var) {
        h06Var.getClass();
        this.L = hv4Var;
        this.R = xv4Var;
        this.X = h06Var;
        this.e0 = new bo1(h06Var, new h4(2, this, tv4.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 7));
        int d = h06Var.d();
        if (d < 32) {
            int i = d + 1;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = -1;
            }
            for (int i3 = 0; i3 < d; i3++) {
                int I = gk2.I(h06Var, i3, false);
                if (I <= d && I != -2) {
                    iArr[I] = i3;
                } else {
                    y0(h06Var, d);
                    return;
                }
            }
            this.Y = iArr;
            return;
        }
        y0(h06Var, d);
    }

    @Override // defpackage.yu0
    public final char B(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return (char) s0(x0(rt4Var, i));
    }

    @Override // defpackage.yu0
    public final byte J(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return (byte) s0(x0(rt4Var, i));
    }

    @Override // defpackage.yu0
    public final String K(h06 h06Var, int i) {
        h06Var.getClass();
        return u0(x0(h06Var, i));
    }

    @Override // defpackage.b91
    public final int L() {
        return s0(m0());
    }

    @Override // defpackage.yu0
    public final short M(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return (short) s0(x0(rt4Var, i));
    }

    @Override // defpackage.yu0
    public final boolean O(h06 h06Var, int i) {
        h06Var.getClass();
        return p0(x0(h06Var, i));
    }

    @Override // defpackage.b91
    public final byte Q() {
        return (byte) s0(m0());
    }

    @Override // defpackage.b91
    public final b91 T(h06 h06Var) {
        h06Var.getClass();
        n0(m0());
        return this;
    }

    @Override // defpackage.yu0
    public final Object U(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        n0(x0(h06Var, i));
        return o0(m93Var, obj);
    }

    @Override // defpackage.yu0
    public final int V(h06 h06Var, int i) {
        h06Var.getClass();
        return s0(x0(h06Var, i));
    }

    @Override // defpackage.b91
    public final short W() {
        return (short) s0(m0());
    }

    @Override // defpackage.b91
    public final String X() {
        return u0(m0());
    }

    @Override // defpackage.b91
    public final float Z() {
        return r0(m0());
    }

    @Override // defpackage.yu0
    public final void a(h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.yu0
    public final long a0(h06 h06Var, int i) {
        h06Var.getClass();
        return t0(x0(h06Var, i));
    }

    @Override // defpackage.yu0
    public final vn1 b() {
        return this.L.b;
    }

    public yu0 c(h06 h06Var) {
        ep2 c;
        kh6 kh6Var;
        boolean x;
        hv4 hv4Var;
        xv4 xv4Var;
        Integer num;
        k70 d;
        h06 h06Var2 = this.X;
        h06Var.getClass();
        try {
            c = h06Var.c();
            kh6Var = kh6.i;
            x = b53.x(c, kh6Var);
            hv4Var = this.L;
            xv4Var = this.R;
        } catch (uv4 e) {
            e = e;
        }
        try {
            if (x) {
                long h0 = h0();
                if (b53.x(h06Var2.c(), kh6Var) && h0 != 19500 && !h06Var2.equals(h06Var)) {
                    xv4 d2 = hi2.d(xv4Var, h0);
                    d2.l();
                    return new ma5(hv4Var, d2, 1 | jv4.DEFAULT.getSignature$kotlinx_serialization_protobuf(), h06Var);
                } else if (xv4Var.c == qv4.SIZE_DELIMITED && gk2.W(h06Var.j(0))) {
                    return new tv4(hv4Var, new xv4(xv4Var.d()), h06Var);
                } else {
                    return new ma5(hv4Var, xv4Var, h0, h06Var);
                }
            } else if (!b53.x(c, kh6.h) && !b53.x(c, kh6.k) && !(c instanceof zp4)) {
                if (b53.x(c, kh6.j)) {
                    if (h0() == 19500) {
                        d = xv4Var.e();
                    } else {
                        d = xv4Var.d();
                    }
                    return new rt3(hv4Var, new xv4(d), h0(), h06Var);
                }
                throw new IllegalArgumentException("Primitives are not supported at top-level");
            } else {
                long h02 = h0();
                if (h02 == 19500 && b53.x(h06Var2, h06Var)) {
                    return this;
                }
                if (gk2.V(h02)) {
                    int i = ((int) (h02 & 2147483647L)) - 1;
                    HashMap hashMap = this.c0;
                    if (hashMap != null && (num = (Integer) hashMap.get(Integer.valueOf(i))) != null) {
                        h02 = (h02 & 1152921500311879680L) | num.intValue();
                    }
                    return new gd4(hv4Var, xv4Var, h02, h06Var);
                }
                return new tv4(hv4Var, hi2.d(xv4Var, h02), h06Var);
            }
        } catch (uv4 e2) {
            e = e2;
            throw new IllegalArgumentException("Fail to begin structure for " + h06Var.b() + " in " + h06Var2.b() + " at proto number " + ((int) (2147483647L & h0())), e);
        }
    }

    @Override // defpackage.b91
    public final int c0(h06 h06Var) {
        h06Var.getClass();
        int s0 = s0(m0());
        if (s0 < h06Var.d() && s0 >= 0 && gk2.I(h06Var, s0, true) == s0) {
            return s0;
        }
        int d = h06Var.d();
        for (int i = 0; i < d; i++) {
            if (gk2.I(h06Var, i, true) == s0) {
                return i;
            }
        }
        String b = this.X.b();
        throw new IllegalArgumentException(s0 + " is not among valid " + b + " enum proto numbers", null);
    }

    @Override // defpackage.b91
    public final double d0() {
        return q0(m0());
    }

    @Override // defpackage.b91
    public final long e() {
        return t0(m0());
    }

    @Override // defpackage.yu0
    public final b91 f(rt4 rt4Var, int i) {
        rt4Var.getClass();
        long x0 = x0(rt4Var, i);
        rt4Var.j(i).getClass();
        n0(x0);
        return this;
    }

    @Override // defpackage.b91
    public final boolean h() {
        return p0(m0());
    }

    @Override // defpackage.b91
    public final boolean i() {
        return !this.d0;
    }

    @Override // defpackage.b91
    public final char j() {
        return (char) s0(m0());
    }

    @Override // defpackage.b91
    public final Object n(m93 m93Var) {
        m93Var.getClass();
        return o0(m93Var, null);
    }

    public final Object o0(m93 m93Var, Object obj) {
        String str;
        String str2;
        byte[] bArr;
        kh6 kh6Var = kh6.j;
        m93Var.getClass();
        try {
            if (m93Var instanceof pq2) {
                return w0(m93Var, obj);
            }
            if (b53.x(m93Var.e(), q70.c.b)) {
                return v0((byte[]) obj);
            }
            if (b53.x(m93Var.e(), h17.c.b)) {
                f17 f17Var = (f17) obj;
                byte[] bArr2 = null;
                if (f17Var != null) {
                    bArr = f17Var.A;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    bArr2 = bArr;
                }
                return new f17(v0(bArr2));
            } else if (m93Var instanceof l0) {
                return ((l0) m93Var).j(this, obj);
            } else {
                return m93Var.b(this);
            }
        } catch (uv4 e) {
            long h0 = h0();
            h06 e2 = m93Var.e();
            h06 h06Var = this.X;
            if (!b53.x(h06Var, e2)) {
                if (b53.x(h06Var.c(), kh6.i) && !b53.x(m93Var.e().c(), kh6Var)) {
                    StringBuilder sb = new StringBuilder("Error while decoding index ");
                    sb.append(((int) (h0 & 2147483647L)) - 1);
                    sb.append(" in repeated field of ");
                    sb.append(m93Var.e().b());
                    str = sb.toString();
                } else if (b53.x(h06Var.c(), kh6Var)) {
                    int i = ((int) (h0 & 2147483647L)) - 1;
                    int i2 = i / 2;
                    if (i % 2 == 0) {
                        str2 = "key";
                    } else {
                        str2 = "value";
                    }
                    str = "Error while decoding " + str2 + " of index " + i2 + " in map field of " + m93Var.e().b();
                } else {
                    str = "Error while decoding " + m93Var.e().b() + " at proto number " + ((int) (h0 & 2147483647L)) + " of " + h06Var.b();
                }
            } else {
                str = "Error while decoding " + h06Var.b();
            }
            throw new IllegalArgumentException(str, e);
        }
    }

    public final boolean p0(long j) {
        int s0 = s0(j);
        if (s0 != 0) {
            if (s0 == 1) {
                return true;
            }
            throw new IllegalArgumentException(wh1.g(s0, "Unexpected boolean value: "));
        }
        return false;
    }

    public final double q0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                return Double.longBitsToDouble(xv4Var.j());
            }
            qv4 qv4Var = qv4.i64;
            if (xv4Var.c == qv4Var) {
                return Double.longBitsToDouble(xv4Var.j());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(qv4Var);
            c44.w(sb, xv4Var.c);
            return 0.0d;
        } catch (uv4 e) {
            c44.c((int) (j & 2147483647L), this.X.b(), e);
            return 0.0d;
        }
    }

    public final float r0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                return Float.intBitsToFloat(xv4Var.h());
            }
            qv4 qv4Var = qv4.i32;
            if (xv4Var.c == qv4Var) {
                return Float.intBitsToFloat(xv4Var.h());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(qv4Var);
            c44.w(sb, xv4Var.c);
            return RecyclerView.A1;
        } catch (uv4 e) {
            c44.c((int) (j & 2147483647L), this.X.b(), e);
            return RecyclerView.A1;
        }
    }

    public final int s0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                return xv4Var.b(jv4.DEFAULT);
            }
            return xv4Var.g(gk2.P(j));
        } catch (uv4 e) {
            c44.c((int) (j & 2147483647L), this.X.b(), e);
            return 0;
        }
    }

    @Override // defpackage.yu0
    public final float t(h06 h06Var, int i) {
        h06Var.getClass();
        return r0(x0(h06Var, i));
    }

    public final long t0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                return xv4Var.c(jv4.DEFAULT);
            }
            return xv4Var.i(gk2.P(j));
        } catch (uv4 e) {
            c44.c((int) (j & 2147483647L), this.X.b(), e);
            return 0L;
        }
    }

    @Override // defpackage.yu0
    public final Object u(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        n0(x0(h06Var, i));
        if (!this.d0) {
            return o0(m93Var, obj);
        }
        return null;
    }

    public String u0(long j) {
        int i = (j > 19500L ? 1 : (j == 19500L ? 0 : -1));
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                int b = xv4Var.b(jv4.DEFAULT);
                xv4.a(b);
                k70 k70Var = xv4Var.a;
                int i2 = k70Var.B;
                String d0 = gh6.d0(i2, i2 + b, 4, (byte[]) k70Var.L);
                k70Var.B += b;
                return d0;
            }
            return xv4Var.k();
        } catch (uv4 e) {
            c44.c((int) (j & 2147483647L), this.X.b(), e);
            return null;
        }
    }

    public int v(h06 h06Var) {
        int intValue;
        HashMap hashMap;
        xv4 xv4Var = this.R;
        h06Var.getClass();
        while (true) {
            try {
                int l = xv4Var.l();
                bo1 bo1Var = this.e0;
                if (l == -1) {
                    return bo1Var.b();
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
                        xv4Var.m();
                    } else {
                        if (gk2.V(gk2.H(h06Var, intValue)) && (hashMap = this.c0) != null) {
                            Integer num = (Integer) hashMap.put(Integer.valueOf(intValue), Integer.valueOf(l));
                        }
                        bo1Var.a(intValue);
                        return intValue;
                    }
                } else {
                    throw new IllegalArgumentException("0 is not allowed as the protobuf field number in " + h06Var.b() + ", the input bytes may have been corrupted");
                }
            } catch (uv4 e) {
                throw new IllegalArgumentException("Fail to get element index for " + h06Var.b() + " in " + this.X.b(), e);
            }
        }
    }

    public final byte[] v0(byte[] bArr) {
        byte[] bArr2;
        long h0 = h0();
        int i = (h0 > 19500L ? 1 : (h0 == 19500L ? 0 : -1));
        byte[] bArr3 = null;
        xv4 xv4Var = this.R;
        try {
            if (i == 0) {
                bArr2 = xv4Var.f();
            } else {
                qv4 qv4Var = qv4.SIZE_DELIMITED;
                if (xv4Var.c == qv4Var) {
                    bArr3 = xv4Var.f();
                } else {
                    StringBuilder sb = new StringBuilder("Expected wire type ");
                    sb.append(qv4Var);
                    c44.w(sb, xv4Var.c);
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
        } catch (uv4 e) {
            c44.c((int) (h0 & 2147483647L), this.X.b(), e);
            return null;
        }
    }

    public final LinkedHashMap w0(m93 m93Var, Object obj) {
        Map map;
        m93Var.getClass();
        pq2 pq2Var = (pq2) m93Var;
        m93 m93Var2 = pq2Var.a;
        m93 m93Var3 = pq2Var.b;
        m93Var2.getClass();
        m93Var3.getClass();
        tt3 tt3Var = new tt3(m93Var2, m93Var3, 0);
        Set set = null;
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map != null) {
            set = map.entrySet();
        }
        Set<Map.Entry> set2 = (Set) new zt(tt3Var, 2).j(this, set);
        int j0 = zt3.j0(uq0.y0(set2, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
        for (Map.Entry entry : set2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public long x0(h06 h06Var, int i) {
        h06Var.getClass();
        return gk2.H(h06Var, i);
    }

    @Override // defpackage.yu0
    public final double y(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return q0(x0(rt4Var, i));
    }

    public final void y0(h06 h06Var, int i) {
        HashMap hashMap = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (gk2.I(h06Var, i3, false) == -2) {
                List<h06> L = gk2.L(h06Var.j(i3), this.L.b);
                ArrayList arrayList = new ArrayList(uq0.y0(L, 10));
                for (h06 h06Var2 : L) {
                    arrayList.add(Integer.valueOf((int) (gk2.H(h06Var2, 0) & 2147483647L)));
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
                hashMap.put(Integer.valueOf(gk2.I(h06Var, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.c0 = new HashMap(i2, 1.0f);
        }
        this.Z = hashMap;
    }
}
