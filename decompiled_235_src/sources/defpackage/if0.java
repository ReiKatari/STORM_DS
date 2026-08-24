package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if0  reason: default package */
/* loaded from: classes.dex */
public final class if0 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [if0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [yt1] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public if0(ex6 ex6Var, Context context, ux uxVar, u63 u63Var, mh0 mh0Var, rr6 rr6Var, ij0 ij0Var) {
        ?? r8;
        int i = 0;
        u63Var.getClass();
        this.b = ex6Var;
        this.d = mh0Var;
        this.e = rr6Var;
        this.f = ij0Var;
        this.g = new ze0((tg0) ex6Var.getValue(), ((tg0) ex6Var.getValue()).b());
        ex6 ex6Var2 = new ex6(new hf0(context, uxVar, this, u63Var, 0));
        this.c = ex6Var2;
        this.i = du1.A;
        this.j = new Object();
        this.k = new AtomicBoolean(false);
        ArrayList a = cf0.a(((eb1) ex6Var2.getValue()).a());
        if (a != null) {
            r8 = new ArrayList(ht0.v0(a, 10));
            int size = a.size();
            while (i < size) {
                Object obj = a.get(i);
                i++;
                r8.add(((xf0) obj).a);
            }
        } else {
            r8 = yt1.A;
        }
        be5 be5Var = ((tg0) ((ex6) this.b).getValue()).b().d().b.k;
        Executor executor = uxVar.a;
        executor.getClass();
        this.h = new bx4(be5Var, g04.i(f04.F(executor)), r8, context);
        h(r8);
    }

    public static final void a(if0 if0Var, z64 z64Var, eg4 eg4Var) {
        y53 y53Var;
        for (z64 z64Var2 = z64Var.X; z64Var2 != null; z64Var2 = z64Var2.X) {
            if (z64Var2 == ((ag4) if0Var.c)) {
                sm3 v = ((sm3) if0Var.b).v();
                if (v != null) {
                    y53Var = (y53) v.B0.d;
                } else {
                    y53Var = null;
                }
                eg4Var.o0 = y53Var;
                if0Var.e = eg4Var;
                return;
            } else if ((z64Var2.L & 2) == 0) {
                z64Var2.Q0(eg4Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z10, z64] */
    public static z64 c(y64 y64Var, z64 z64Var) {
        z64 z64Var2;
        if (y64Var instanceof e74) {
            z64Var2 = ((e74) y64Var).e();
            z64Var2.L = fg4.f(z64Var2);
        } else {
            ?? z64Var3 = new z64();
            z64Var3.L = fg4.d(y64Var);
            z64Var3.k0 = y64Var;
            new HashSet();
            z64Var2 = z64Var3;
        }
        if (z64Var2.j0) {
            p53.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        z64Var2.e0 = true;
        z64 z64Var4 = z64Var.Y;
        if (z64Var4 != null) {
            z64Var4.X = z64Var2;
            z64Var2.Y = z64Var4;
        }
        z64Var.Y = z64Var2;
        z64Var2.X = z64Var;
        return z64Var2;
    }

    public static z64 d(z64 z64Var) {
        boolean z = z64Var.j0;
        if (z) {
            y94 y94Var = fg4.a;
            if (!z) {
                p53.c("autoInvalidateRemovedNode called on unattached node");
            }
            fg4.a(z64Var, -1, 2);
            z64Var.O0();
            z64Var.I0();
        }
        z64 z64Var2 = z64Var.Y;
        z64 z64Var3 = z64Var.X;
        if (z64Var2 != null) {
            z64Var2.X = z64Var3;
            z64Var.Y = null;
        }
        if (z64Var3 != null) {
            z64Var3.Y = z64Var2;
            z64Var.X = null;
        }
        z64Var3.getClass();
        return z64Var3;
    }

    public static void l(y64 y64Var, y64 y64Var2, z64 z64Var) {
        if ((y64Var instanceof e74) && (y64Var2 instanceof e74)) {
            z64Var.getClass();
            ((e74) y64Var2).g(z64Var);
            if (z64Var.j0) {
                fg4.c(z64Var);
            } else {
                z64Var.f0 = true;
            }
        } else if (z64Var instanceof z10) {
            z10 z10Var = (z10) z64Var;
            boolean z = z10Var.j0;
            if (z) {
                if (!z) {
                    p53.c("unInitializeModifier called on unattached node");
                }
                if ((z10Var.L & 8) != 0) {
                    ((te) nc1.g0(z10Var)).y();
                }
            }
            z10Var.k0 = y64Var2;
            z10Var.L = fg4.d(y64Var2);
            if (z10Var.j0) {
                z10Var.R0(false);
            }
            if (z64Var.j0) {
                fg4.c(z64Var);
            } else {
                z64Var.f0 = true;
            }
        } else {
            p53.c("Unknown Modifier.Node type");
        }
    }

    public LinkedHashSet b(List list) {
        String str;
        ex6 ex6Var = (ex6) this.c;
        eb1 eb1Var = (eb1) ex6Var.getValue();
        mh0 mh0Var = (mh0) this.d;
        List<String> k1 = gt0.k1(list);
        rr6 rr6Var = (rr6) this.e;
        eb1Var.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            cf0 a = eb1Var.a();
            if (mh0Var != null) {
                try {
                    str = f04.y(a, mh0Var.b());
                } catch (IllegalStateException e) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : k1) {
                    if (!nb3.k(str2, str)) {
                        eb1 eb1Var2 = eb1Var.b;
                        xf0.a(str2);
                        cg0 q = ((eg0) new gb1(eb1Var2, new gr1(str2), rr6Var).z.get()).q();
                        q.getClass();
                        arrayList2.add(q);
                    }
                }
                ArrayList a2 = mh0Var.a(arrayList2);
                int size = a2.size();
                int i = 0;
                while (i < size) {
                    Object obj = a2.get(i);
                    i++;
                    zf0 zf0Var = (zf0) obj;
                    zf0Var.getClass();
                    String d = ((cg0) zf0Var).d();
                    d.getClass();
                    arrayList.add(d);
                }
                k1 = arrayList;
            }
            cf0 a3 = ((eb1) ex6Var.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : k1) {
                if (!nb3.k(str3, "0") && !nb3.k(str3, "1")) {
                    if (l.B(a3, str3)) {
                        arrayList3.add(str3);
                    } else if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                    }
                } else {
                    arrayList3.add(str3);
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (kj2.G()) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new Exception(e2);
        }
    }

    public Set e() {
        synchronized (this.j) {
            if (((AtomicBoolean) this.k).get()) {
                return du1.A;
            }
            return new LinkedHashSet((Set) this.i);
        }
    }

    public eg0 f(String str) {
        str.getClass();
        if (!((AtomicBoolean) this.k).get()) {
            eb1 eb1Var = ((eb1) ((ex6) this.c).getValue()).b;
            xf0.a(str);
            return (eg0) new gb1(eb1Var, new gr1(str), (rr6) this.e).z.get();
        }
        throw new Exception("CameraFactory has been shut down.");
    }

    public boolean g(int i) {
        if ((((z64) this.g).R & i) != 0) {
            return true;
        }
        return false;
    }

    public void h(List list) {
        if (((AtomicBoolean) this.k).get()) {
            return;
        }
        LinkedHashSet b = b(list);
        synchronized (this.j) {
            try {
                if (((AtomicBoolean) this.k).get()) {
                    return;
                }
                if (nb3.k((Set) this.i, b)) {
                    return;
                }
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + ((Set) this.i) + " -> " + b);
                }
                this.i = b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        for (z64 z64Var = (z64) this.g; z64Var != null; z64Var = z64Var.Y) {
            z64Var.N0();
            if (z64Var.e0) {
                y94 y94Var = fg4.a;
                if (!z64Var.j0) {
                    p53.c("autoInvalidateInsertedNode called on unattached node");
                }
                fg4.a(z64Var, -1, 1);
            }
            if (z64Var.f0) {
                fg4.c(z64Var);
            }
            z64Var.e0 = false;
            z64Var.f0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
        if ((r19 & 1) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
        if (r13 > r1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
        if (r13 == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
        if (r13 == r1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
        if (r1 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
        if (r14 != r11) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (r14 <= r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a6, code lost:
        if (r11 <= r15) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
        if (r6.b(r14 - 1, r27 - 1) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
        if (r24 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
        if (r11 < r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
        if (r11 > r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
        if (r16[r17 + r11] < r14) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Type inference failed for: r6v3, types: [ra4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(int i, ua4 ua4Var, ua4 ua4Var2, z64 z64Var, boolean z) {
        ra4 ra4Var;
        int i2;
        int[] iArr;
        int[] iArr2;
        int i3;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ra4 ra4Var2 = (ra4) this.k;
        if (ra4Var2 == null) {
            ?? obj = new Object();
            obj.f = this;
            obj.c = z64Var;
            obj.a = i;
            obj.d = ua4Var;
            obj.e = ua4Var2;
            obj.b = z;
            this.k = obj;
            ra4Var = obj;
        } else {
            ra4Var2.c = z64Var;
            ra4Var2.a = i;
            ra4Var2.d = ua4Var;
            ra4Var2.e = ua4Var2;
            ra4Var2.b = z;
            ra4Var = ra4Var2;
        }
        if0 if0Var = (if0) ra4Var.f;
        int i15 = ua4Var.L - i;
        int i16 = ua4Var2.L - i;
        char c3 = 2;
        int i17 = ((i15 + i16) + 1) / 2;
        r93 r93Var = new r93(i17 * 3);
        r93 r93Var2 = new r93(i17 * 4);
        int i18 = 0;
        r93Var2.e(0, i15, 0, i16);
        int i19 = (i17 * 2) + 1;
        int[] iArr3 = new int[i19];
        int[] iArr4 = new int[i19];
        int[] iArr5 = new int[5];
        while (true) {
            int i20 = r93Var2.b;
            if (i20 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = r93Var2.a;
            int i21 = i18;
            int i22 = i20 - 1;
            r93Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i20 - 2;
            r93Var2.b = i24;
            int i25 = iArr6[i24];
            int i26 = i20 - 3;
            r93Var2.b = i26;
            int i27 = iArr6[i26];
            int i28 = i20 - 4;
            r93Var2.b = i28;
            int i29 = iArr6[i28];
            int i30 = i27 - i29;
            int i31 = i19;
            int i32 = i23 - i25;
            int[] iArr7 = iArr3;
            if (i30 >= 1 && i32 >= 1) {
                int i33 = 1;
                int i34 = ((i30 + i32) + 1) / 2;
                int i35 = i31 / 2;
                int i36 = i35 + 1;
                iArr7[i36] = i29;
                iArr4[i36] = i27;
                int i37 = i21;
                while (i37 < i34) {
                    int i38 = i30 - i32;
                    int i39 = i34;
                    iArr = iArr4;
                    if ((Math.abs(i38) & 1) == i33) {
                        i3 = 1;
                    } else {
                        i3 = i21;
                    }
                    int i40 = -i37;
                    int i41 = i3;
                    int i42 = i40;
                    while (true) {
                        if (i42 > i37) {
                            break;
                        }
                        if (i42 != i40) {
                            if (i42 != i37) {
                                i8 = i42;
                                iArr2 = iArr5;
                            } else {
                                i8 = i42;
                                iArr2 = iArr5;
                            }
                            i9 = iArr7[(i8 - 1) + i35];
                            i10 = i9 + 1;
                            int i43 = ((i10 - i29) + i25) - i8;
                            if (i37 == 0) {
                                i11 = 1;
                            } else {
                                i11 = i21;
                            }
                            if (i10 != i9) {
                                i12 = 1;
                            } else {
                                i12 = i21;
                            }
                            int i44 = i43 - (i11 & i12);
                            int i45 = i9;
                            i13 = i43;
                            while (i10 < i27 && i13 < i23 && ra4Var.b(i10, i13)) {
                                i10++;
                                i13++;
                            }
                            iArr7[i35 + i8] = i10;
                            if (i41 == 0) {
                                int i46 = i13;
                                int i47 = i38 - i8;
                                i14 = i30;
                                if (i47 >= i40 + 1 && i47 <= i37 - 1 && iArr[i35 + i47] <= i10) {
                                    iArr2[i21] = i45;
                                    iArr2[1] = i44;
                                    iArr2[c4] = i10;
                                    iArr2[3] = i46;
                                    iArr2[4] = i21;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i14 = i30;
                            }
                            i42 = i8 + 2;
                            iArr5 = iArr2;
                            i30 = i14;
                        } else {
                            i8 = i42;
                            iArr2 = iArr5;
                        }
                        i9 = iArr7[i8 + 1 + i35];
                        i10 = i9;
                        int i432 = ((i10 - i29) + i25) - i8;
                        if (i37 == 0) {
                        }
                        if (i10 != i9) {
                        }
                        int i442 = i432 - (i11 & i12);
                        int i452 = i9;
                        i13 = i432;
                        while (i10 < i27) {
                            i10++;
                            i13++;
                        }
                        iArr7[i35 + i8] = i10;
                        if (i41 == 0) {
                        }
                        i42 = i8 + 2;
                        iArr5 = iArr2;
                        i30 = i14;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i21], iArr2[3] - iArr2[c]) > 0) {
                        int i48 = iArr2[i21];
                        int i49 = iArr2[c];
                        int i50 = iArr2[3] - i49;
                        int i51 = iArr2[c4] - i48;
                        if (i50 != i51) {
                            i51 = Math.min(i51, i50);
                            int i52 = iArr2[4];
                            if (i52 != 0) {
                                i4 = 1;
                            } else {
                                i4 = i21;
                            }
                            int i53 = iArr2[3];
                            c2 = 1;
                            int i54 = iArr2[1];
                            int i55 = i53 - i54;
                            int i56 = iArr2[c4];
                            int i57 = iArr2[i21];
                            if (i55 > i56 - i57) {
                                i5 = 1;
                            } else {
                                i5 = i21;
                            }
                            int i58 = i48 + ((i5 | i4) ^ 1);
                            if (i52 != 0) {
                                i6 = 1;
                            } else {
                                i6 = i21;
                            }
                            if (i53 - i54 > i56 - i57) {
                                i7 = 1;
                            } else {
                                i7 = i21;
                            }
                            i49 += ((i7 ^ 1) | i6) ^ 1;
                            i48 = i58;
                        } else {
                            c2 = 1;
                        }
                        r93Var.d(i48, i49, i51);
                    } else {
                        c2 = c;
                    }
                    r93Var2.e(i29, iArr2[i21], i25, iArr2[c2]);
                    r93Var2.e(iArr2[c4], i27, iArr2[3], i23);
                    c3 = c4;
                    i18 = i21;
                    i19 = i31;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i18 = i21;
            i19 = i31;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i59 = i18;
        int i60 = r93Var.b;
        if (i60 % 3 != 0) {
            p53.c("Array size not a multiple of 3");
        }
        if (i60 > 3) {
            i2 = i59;
            r93Var.f(i2, i60 - 3);
        } else {
            i2 = i59;
        }
        r93Var.d(i15, i16, i2);
        int i61 = i2;
        int i62 = i61;
        int i63 = i62;
        while (i61 < r93Var.b) {
            int[] iArr8 = r93Var.a;
            int i64 = iArr8[i61];
            int i65 = iArr8[i61 + 2];
            int i66 = i64 - i65;
            int i67 = iArr8[i61 + 1] - i65;
            i61 += 3;
            while (i62 < i66) {
                z64 z64Var2 = ((z64) ra4Var.c).Y;
                z64Var2.getClass();
                if ((z64Var2.L & 2) != 0) {
                    eg4 eg4Var = z64Var2.d0;
                    eg4Var.getClass();
                    eg4 eg4Var2 = eg4Var.o0;
                    eg4 eg4Var3 = eg4Var.n0;
                    eg4Var3.getClass();
                    if (eg4Var2 != null) {
                        eg4Var2.n0 = eg4Var3;
                    }
                    eg4Var3.o0 = eg4Var2;
                    a(if0Var, (z64) ra4Var.c, eg4Var3);
                }
                ra4Var.c = d(z64Var2);
                i62++;
            }
            while (i63 < i67) {
                z64 c5 = c((y64) ((ua4) ra4Var.e).A[ra4Var.a + i63], (z64) ra4Var.c);
                ra4Var.c = c5;
                if (ra4Var.b) {
                    z64 z64Var3 = c5.Y;
                    z64Var3.getClass();
                    eg4 eg4Var4 = z64Var3.d0;
                    eg4Var4.getClass();
                    jm3 D = nc1.D((z64) ra4Var.c);
                    if (D != null) {
                        mm3 mm3Var = new mm3((sm3) if0Var.b, D);
                        ((z64) ra4Var.c).Q0(mm3Var);
                        a(if0Var, (z64) ra4Var.c, mm3Var);
                        mm3Var.o0 = eg4Var4.o0;
                        mm3Var.n0 = eg4Var4;
                        eg4Var4.o0 = mm3Var;
                    } else {
                        ((z64) ra4Var.c).Q0(eg4Var4);
                    }
                    ((z64) ra4Var.c).H0();
                    ((z64) ra4Var.c).N0();
                    z64 z64Var4 = (z64) ra4Var.c;
                    y94 y94Var = fg4.a;
                    if (!z64Var4.j0) {
                        p53.c("autoInvalidateInsertedNode called on unattached node");
                    }
                    fg4.a(z64Var4, -1, 1);
                } else {
                    c5.e0 = true;
                }
                i63++;
            }
            while (true) {
                int i68 = i65 - 1;
                if (i65 > 0) {
                    z64 z64Var5 = ((z64) ra4Var.c).Y;
                    z64Var5.getClass();
                    ra4Var.c = z64Var5;
                    int i69 = ra4Var.a;
                    y64 y64Var = (y64) ((ua4) ra4Var.d).A[i69 + i62];
                    y64 y64Var2 = (y64) ((ua4) ra4Var.e).A[i69 + i63];
                    if (!nb3.k(y64Var, y64Var2)) {
                        l(y64Var, y64Var2, (z64) ra4Var.c);
                    }
                    i62++;
                    i63++;
                    i65 = i68;
                }
            }
        }
        int i70 = i2;
        for (z64 z64Var6 = ((vy6) this.f).X; z64Var6 != null && z64Var6 != ((ag4) this.c); z64Var6 = z64Var6.X) {
            i70 |= z64Var6.L;
            z64Var6.R = i70;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k() {
        y53 y53Var;
        y53 y53Var2;
        sm3 sm3Var = (sm3) this.b;
        y53 y53Var3 = (y53) this.d;
        for (z64 z64Var = ((vy6) this.f).X; z64Var != null; z64Var = z64Var.X) {
            jm3 D = nc1.D(z64Var);
            if (D != null) {
                eg4 eg4Var = z64Var.d0;
                if (eg4Var != null) {
                    mm3 mm3Var = (mm3) eg4Var;
                    jm3 jm3Var = mm3Var.P0;
                    mm3Var.A1(D);
                    y53Var2 = mm3Var;
                    if (jm3Var != z64Var) {
                        yp4 yp4Var = mm3Var.J0;
                        y53Var2 = mm3Var;
                        if (yp4Var != null) {
                            ((xt2) yp4Var).c();
                            y53Var2 = mm3Var;
                        }
                    }
                } else {
                    eg4 mm3Var2 = new mm3(sm3Var, D);
                    z64Var.Q0(mm3Var2);
                    y53Var2 = mm3Var2;
                }
                y53Var3.o0 = y53Var2;
                y53Var2.n0 = y53Var3;
                y53Var3 = y53Var2;
            } else {
                z64Var.Q0(y53Var3);
            }
        }
        sm3 v = sm3Var.v();
        if (v != null) {
            y53Var = (y53) v.B0.d;
        } else {
            y53Var = null;
        }
        y53Var3.o0 = y53Var;
        this.e = y53Var3;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                z64 z64Var = (z64) this.g;
                vy6 vy6Var = (vy6) this.f;
                if (z64Var == vy6Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (z64Var != null && z64Var != vy6Var) {
                            sb.append(String.valueOf(z64Var));
                            if (z64Var.Y == vy6Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                z64Var = z64Var.Y;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public if0(sm3 sm3Var) {
        this.b = sm3Var;
        z64 z64Var = new z64();
        z64Var.R = -1;
        this.c = z64Var;
        y53 y53Var = new y53(sm3Var);
        this.d = y53Var;
        this.e = y53Var;
        vy6 vy6Var = y53Var.P0;
        this.f = vy6Var;
        this.g = vy6Var;
        this.j = new ua4(new a74[16]);
    }
}
