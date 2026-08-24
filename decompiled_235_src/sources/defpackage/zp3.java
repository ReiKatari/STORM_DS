package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zp3  reason: default package */
/* loaded from: classes.dex */
public final class zp3 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Serializable f;
    public final Object g;
    public final Object h;
    public final Object i;

    public zp3() {
        long[] jArr = b66.a;
        this.a = new ja4();
        ka4 ka4Var = c66.a;
        this.c = new ka4();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new wp3(this);
    }

    public static int h(int[] iArr, gq3 gq3Var) {
        int i = gq3Var.i();
        int c = gq3Var.c() + i;
        int i2 = 0;
        while (i < c) {
            int b = gq3Var.b() + iArr[i];
            iArr[i] = b;
            i2 = Math.max(i2, b);
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (((defpackage.yc) r8.a).g(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[Catch: all -> 0x00a2, CancellationException -> 0x00a4, TRY_ENTER, TryCatch #6 {CancellationException -> 0x00a4, all -> 0x00a2, blocks: (B:19:0x0039, B:39:0x0081, B:36:0x0072), top: B:68:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(s41 s41Var) {
        wb5 wb5Var;
        Object obj;
        x61 x61Var;
        int i;
        boolean booleanValue;
        List list;
        try {
            try {
                try {
                    if (s41Var instanceof wb5) {
                        wb5Var = (wb5) s41Var;
                        int i2 = wb5Var.Z;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            wb5Var.Z = i2 - Integer.MIN_VALUE;
                            obj = wb5Var.X;
                            x61Var = x61.COROUTINE_SUSPENDED;
                            i = wb5Var.Z;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4) {
                                                oi2.Y(obj);
                                                return obj;
                                            }
                                            i.m("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        booleanValue = wb5Var.R;
                                        oi2.Y(obj);
                                        list = (List) obj;
                                        if (list != null) {
                                            return new ac5(yb5.PENDING_VERIFICATION, null);
                                        }
                                        kg4 kg4Var = kg4.B;
                                        ji jiVar = new ji(this, list, (r41) null, 10);
                                        wb5Var.R = booleanValue;
                                        wb5Var.Z = 4;
                                        Object d0 = hv.d0(kg4Var, jiVar, wb5Var);
                                        if (d0 == x61Var) {
                                            return x61Var;
                                        }
                                        return d0;
                                    }
                                    oi2.Y(obj);
                                    booleanValue = ((Boolean) obj).booleanValue();
                                    if (!booleanValue) {
                                        return new ac5(yb5.IDENTITY_VERIFICATION, null);
                                    }
                                    wb5Var.R = booleanValue;
                                    wb5Var.Z = 3;
                                    obj = ((ad) this.c).g(wb5Var);
                                    if (obj == x61Var) {
                                        return x61Var;
                                    }
                                    list = (List) obj;
                                    if (list != null) {
                                    }
                                } else {
                                    oi2.Y(obj);
                                }
                            } else {
                                oi2.Y(obj);
                                wb5Var.Z = 1;
                            }
                            wb5Var.Z = 2;
                            obj = ((m22) this.b).g(wb5Var);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (!booleanValue) {
                            }
                        }
                    }
                    if (i == 0) {
                    }
                    wb5Var.Z = 2;
                    obj = ((m22) this.b).g(wb5Var);
                    if (obj == x61Var) {
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return new ac5(yb5.PENDING_VERIFICATION, th.getClass().getSimpleName());
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th2) {
                return new ac5(yb5.TRANSPORT_SUSPENSION, th2.getClass().getSimpleName());
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th3) {
            return new ac5(yb5.IDENTITY_VERIFICATION, th3.getClass().getSimpleName());
        }
        wb5Var = new wb5(this, s41Var);
        obj = wb5Var.X;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = wb5Var.Z;
    }

    public void b(int i, Object obj) {
        xg6.A(((ja4) this.a).g(obj));
    }

    public long c() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        xg6.A(arrayList.get(0));
        throw null;
    }

    public void d(af5 af5Var, String str) {
        af5Var.getClass();
        str.getClass();
        byte[] byteArray = ((ByteArrayOutputStream) this.h).toByteArray();
        tu0 tu0Var = (tu0) this.i;
        byteArray.getClass();
        if (byteArray.length == 0) {
            byteArray = null;
        }
        tu0Var.b0(byteArray);
    }

    public void e(int i, int i2, ArrayList arrayList, ei eiVar, gx0 gx0Var, boolean z, int i3, boolean z2, int i4, int i5) {
        boolean z3;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z4;
        ArrayList arrayList4;
        Throwable th;
        ja4 ja4Var;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ja4 ja4Var2;
        int i6;
        Object obj2;
        ArrayList arrayList8 = (ArrayList) this.e;
        ArrayList arrayList9 = (ArrayList) this.d;
        ka4 ka4Var = (ka4) this.c;
        Object obj3 = this.a;
        ja4 ja4Var3 = (ja4) obj3;
        ArrayList arrayList10 = (ArrayList) this.g;
        ArrayList arrayList11 = (ArrayList) this.f;
        ei eiVar2 = (ei) this.b;
        this.b = eiVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            gq3 gq3Var = (gq3) arrayList.get(i7);
            int a = gq3Var.a();
            for (int i8 = 0; i8 < a; i8++) {
                gq3Var.d(i8);
            }
        }
        if (ja4Var3.i()) {
            g();
            return;
        }
        gq3 gq3Var2 = (gq3) gt0.J0(arrayList);
        if (!z && z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        Object[] objArr = ja4Var3.b;
        long[] jArr = ja4Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            z4 = z3;
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                arrayList2 = arrayList10;
                arrayList3 = arrayList11;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j & 255) < 128) {
                            obj2 = obj3;
                            ka4Var.a(objArr[(i9 << 3) + i11]);
                        } else {
                            obj2 = obj3;
                        }
                        j >>= 8;
                        i11++;
                        obj3 = obj2;
                    }
                    obj = obj3;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    obj = obj3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                arrayList10 = arrayList2;
                arrayList11 = arrayList3;
                obj3 = obj;
            }
        } else {
            obj = obj3;
            arrayList2 = arrayList10;
            arrayList3 = arrayList11;
            z4 = z3;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            gq3 gq3Var3 = (gq3) arrayList.get(i12);
            ka4Var.l(gq3Var3.getKey());
            int a2 = gq3Var3.a();
            for (int i13 = 0; i13 < a2; i13++) {
                gq3Var3.d(i13);
            }
            xg6.A(((ja4) obj).k(gq3Var3.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        if (z4 && eiVar2 != null) {
            if (!arrayList9.isEmpty()) {
                if (arrayList9.size() > 1) {
                    jt0.x0(arrayList9, new yp3(eiVar2, 2));
                }
                if (arrayList9.size() <= 0) {
                    i6 = 0;
                    Arrays.fill(iArr, 0, i3, 0);
                } else {
                    gq3 gq3Var4 = (gq3) arrayList9.get(0);
                    h(iArr, gq3Var4);
                    Object g = ja4Var3.g(gq3Var4.getKey());
                    g.getClass();
                    xg6.A(g);
                    gq3Var4.h(0);
                    throw null;
                }
            } else {
                i6 = 0;
            }
            if (!arrayList8.isEmpty()) {
                if (arrayList8.size() > 1) {
                    jt0.x0(arrayList8, new yp3(eiVar2, i6));
                }
                if (arrayList8.size() <= 0) {
                    Arrays.fill(iArr, i6, i3, i6);
                } else {
                    gq3 gq3Var5 = (gq3) arrayList8.get(i6);
                    h(iArr, gq3Var5);
                    Object g2 = ja4Var3.g(gq3Var5.getKey());
                    g2.getClass();
                    xg6.A(g2);
                    gq3Var5.h(i6);
                    throw null;
                }
            }
        }
        Object[] objArr2 = ka4Var.b;
        long[] jArr2 = ka4Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j2 = jArr2[i14];
                th = th2;
                ja4 ja4Var4 = ja4Var3;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            arrayList7 = arrayList8;
                            ja4Var2 = ja4Var4;
                            xg6.A(ja4Var2.g(objArr2[(i14 << 3) + i16]));
                        } else {
                            arrayList7 = arrayList8;
                            ja4Var2 = ja4Var4;
                        }
                        j2 >>= 8;
                        i16++;
                        ja4Var4 = ja4Var2;
                        arrayList8 = arrayList7;
                    }
                    arrayList4 = arrayList8;
                    ja4Var = ja4Var4;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    arrayList4 = arrayList8;
                    ja4Var = ja4Var4;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                th2 = th;
                ja4Var3 = ja4Var;
                arrayList8 = arrayList4;
            }
        } else {
            arrayList4 = arrayList8;
            th = null;
            ja4Var = ja4Var3;
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() > 1) {
                arrayList5 = arrayList3;
                jt0.x0(arrayList5, new yp3(eiVar, 3));
            } else {
                arrayList5 = arrayList3;
            }
            if (arrayList5.size() > 0) {
                gq3 gq3Var6 = (gq3) arrayList5.get(0);
                Object g3 = ja4Var.g(gq3Var6.getKey());
                g3.getClass();
                xg6.A(g3);
                h(iArr, gq3Var6);
                if (z) {
                    ((gq3) gt0.H0(arrayList)).h(0);
                }
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        } else {
            arrayList5 = arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.size() > 1) {
                arrayList6 = arrayList2;
                jt0.x0(arrayList6, new yp3(eiVar, 1));
            } else {
                arrayList6 = arrayList2;
            }
            if (arrayList6.size() > 0) {
                gq3 gq3Var7 = (gq3) arrayList6.get(0);
                Object g4 = ja4Var.g(gq3Var7.getKey());
                g4.getClass();
                xg6.A(g4);
                h(iArr, gq3Var7);
                throw th;
            }
        } else {
            arrayList6 = arrayList2;
        }
        Collections.reverse(arrayList5);
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList6);
        arrayList9.clear();
        arrayList4.clear();
        arrayList5.clear();
        arrayList6.clear();
        ka4Var.b();
    }

    public void f(af5 af5Var, wl5 wl5Var) {
        String str;
        ((dh5) this.a).A = af5Var;
        String format = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z (zzzz)", Locale.US).format(new Date());
        af5Var.f("X-Timestamp:" + format + "\r\nContent-Type:application/json;charset=utf-8\r\nPath:speech.config\r\n\r\n{\"context\":{\"synthesis\":{\"audio\":{\"metadataoptions\":{\"sentenceBoundaryEnabled\":\"false\",\"wordBoundaryEnabled\":\"false\"},\"outputFormat\":\"audio-24khz-48kbitrate-mono-mp3\"}}}}");
        String e0 = xs6.e0(xs6.e0(xs6.e0(xs6.e0(xs6.e0((String) this.b, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
        String str2 = (String) this.c;
        if (xs6.g0(str2, "ru-", false)) {
            str = "ru-RU";
        } else if (xs6.g0(str2, "ja-", false)) {
            str = "ja-JP";
        } else if (xs6.g0(str2, "zh-", false)) {
            str = "zh-CN";
        } else if (xs6.g0(str2, "de-", false)) {
            str = "de-DE";
        } else if (xs6.g0(str2, "fr-", false)) {
            str = "fr-FR";
        } else if (xs6.g0(str2, "es-", false)) {
            str = "es-ES";
        } else if (xs6.g0(str2, "it-", false)) {
            str = "it-IT";
        } else {
            str = "en-US";
        }
        StringBuilder u = i61.u("X-RequestId:", (String) this.d, "\r\nX-Timestamp:", format, "\r\nContent-Type:application/ssml+xml\r\nPath:ssml\r\n\r\n<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xmlns:mstts='https://www.w3.org/2001/mstts' xml:lang='");
        i61.B(u, str, "'><voice name='", str2, "'><prosody pitch='");
        i61.B(u, (String) this.e, "' rate='", (String) this.f, "' volume='");
        u.append((String) this.g);
        u.append("'>");
        u.append(e0);
        u.append("</prosody></voice></speak>");
        af5Var.f(u.toString());
    }

    public void g() {
        ja4 ja4Var = (ja4) this.a;
        if (ja4Var.j()) {
            Object[] objArr = ja4Var.c;
            long[] jArr = ja4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) >= 128) {
                                j >>= 8;
                            } else {
                                xg6.A(objArr[(i << 3) + i3]);
                                throw null;
                            }
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
            ja4Var.a();
        }
    }

    public /* synthetic */ zp3(Serializable serializable, Serializable serializable2, Serializable serializable3, Object obj, Serializable serializable4, Serializable serializable5, Object obj2, Object obj3, Object obj4) {
        this.a = serializable;
        this.b = serializable2;
        this.c = serializable3;
        this.d = obj;
        this.e = serializable4;
        this.f = serializable5;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
