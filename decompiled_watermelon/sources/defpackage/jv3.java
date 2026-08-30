package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EdgeEffect;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* renamed from: jv3  reason: default package */
/* loaded from: classes.dex */
public abstract class jv3 {
    public static final Object a = new Object();
    public static final et0 b = new et0(1568795229, false, new ot0(16));
    public static final et0 c = new et0(-254675756, false, new ot0(17));
    public static final et0 d = new et0(28240038, false, new xk0(26));
    public static final et0 e = new et0(-1656633265, false, new xk0(27));
    public static final et0 f = new et0(1491343221, false, new pt0(0));
    public static final et0 g = new et0(2097151646, false, new pt0(1));
    public static final k10 h = new Object();
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final Object j = new Object();
    public static Method k;
    public static Method l;
    public static boolean m;
    public static ax2 n;
    public static ax2 o;

    public static Object A(Future future) {
        boolean isDone = future.isDone();
        nl2.D("Future was expected to be done, " + future, isDone);
        return I(future);
    }

    public static final ax2 B() {
        ax2 ax2Var = o;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.FileDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.0f, 9.0f);
        vq2Var.l(-4.0f);
        vq2Var.t(3.0f);
        vq2Var.k(9.0f);
        vq2Var.u(6.0f);
        vq2Var.k(5.0f);
        vq2Var.n(7.0f, 7.0f);
        vq2Var.n(7.0f, -7.0f);
        vq2Var.g();
        vq2Var.o(5.0f, 18.0f);
        vq2Var.u(2.0f);
        vq2Var.l(14.0f);
        vq2Var.u(-2.0f);
        vq2Var.k(5.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        o = b2;
        return b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.er5 F(android.view.Display r3, int r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = defpackage.ph0.l(r3, r4)
            if (r3 == 0) goto L36
            er5 r4 = new er5
            int r0 = defpackage.ph0.c(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = defpackage.wh1.g(r0, r3)
            defpackage.i.i(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = defpackage.ph0.A(r3)
            android.graphics.Point r3 = defpackage.dr5.b(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.F(android.view.Display, int):er5");
    }

    public static Object I(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, k10] */
    public static void J(int i2, ky0 ky0Var, gz0 gz0Var, boolean z) {
        boolean z2;
        cy0 cy0Var;
        cy0 cy0Var2;
        char c2;
        char c3;
        cy0 cy0Var3;
        cy0 cy0Var4;
        if (!gz0Var.m) {
            if (!(gz0Var instanceof hz0) && gz0Var.A() && m(gz0Var)) {
                hz0.W(gz0Var, ky0Var, new Object());
            }
            cy0 j2 = gz0Var.j(by0.LEFT);
            cy0 j3 = gz0Var.j(by0.RIGHT);
            int d2 = j2.d();
            int d3 = j3.d();
            HashSet hashSet = j2.a;
            if (hashSet != null && j2.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    cy0 cy0Var5 = (cy0) it.next();
                    gz0 gz0Var2 = cy0Var5.d;
                    int i3 = i2 + 1;
                    boolean m2 = m(gz0Var2);
                    cy0 cy0Var6 = gz0Var2.I;
                    cy0 cy0Var7 = gz0Var2.K;
                    if (gz0Var2.A() && m2) {
                        c2 = 0;
                        hz0.W(gz0Var2, ky0Var, new Object());
                    } else {
                        c2 = 0;
                    }
                    if ((cy0Var5 == cy0Var6 && (cy0Var4 = cy0Var7.f) != null && cy0Var4.c) || (cy0Var5 == cy0Var7 && (cy0Var3 = cy0Var6.f) != null && cy0Var3.c)) {
                        c3 = 1;
                    } else {
                        c3 = c2;
                    }
                    fz0 fz0Var = gz0Var2.T[c2];
                    fz0 fz0Var2 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var == fz0Var2 && !m2) {
                        if (fz0Var == fz0Var2 && gz0Var2.v >= 0 && gz0Var2.u >= 0 && (gz0Var2.h0 == 8 || (gz0Var2.r == 0 && gz0Var2.X == RecyclerView.A1))) {
                            if (!gz0Var2.y() && !gz0Var2.F && c3 != 0 && !gz0Var2.y()) {
                                a0(i3, gz0Var, ky0Var, gz0Var2, z);
                            }
                        }
                    } else if (!gz0Var2.A()) {
                        if (cy0Var5 == cy0Var6 && cy0Var7.f == null) {
                            int e2 = cy0Var6.e() + d2;
                            gz0Var2.K(e2, gz0Var2.r() + e2);
                            J(i3, ky0Var, gz0Var2, z);
                        } else if (cy0Var5 == cy0Var7 && cy0Var6.f == null) {
                            int e3 = d2 - cy0Var7.e();
                            gz0Var2.K(e3 - gz0Var2.r(), e3);
                            J(i3, ky0Var, gz0Var2, z);
                        } else if (c3 != 0 && !gz0Var2.y()) {
                            Z(i3, ky0Var, gz0Var2, z);
                        }
                    }
                }
            }
            if (gz0Var instanceof yo2) {
                return;
            }
            HashSet hashSet2 = j3.a;
            if (hashSet2 != null && j3.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    cy0 cy0Var8 = (cy0) it2.next();
                    gz0 gz0Var3 = cy0Var8.d;
                    int i4 = i2 + 1;
                    boolean m3 = m(gz0Var3);
                    cy0 cy0Var9 = gz0Var3.I;
                    cy0 cy0Var10 = gz0Var3.K;
                    if (gz0Var3.A() && m3) {
                        hz0.W(gz0Var3, ky0Var, new Object());
                    }
                    if ((cy0Var8 == cy0Var9 && (cy0Var2 = cy0Var10.f) != null && cy0Var2.c) || (cy0Var8 == cy0Var10 && (cy0Var = cy0Var9.f) != null && cy0Var.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fz0 fz0Var3 = gz0Var3.T[0];
                    fz0 fz0Var4 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var3 == fz0Var4 && !m3) {
                        if (fz0Var3 == fz0Var4 && gz0Var3.v >= 0 && gz0Var3.u >= 0) {
                            if (gz0Var3.h0 == 8 || (gz0Var3.r == 0 && gz0Var3.X == RecyclerView.A1)) {
                                if (!gz0Var3.y() && !gz0Var3.F && z2 && !gz0Var3.y()) {
                                    a0(i4, gz0Var, ky0Var, gz0Var3, z);
                                }
                            }
                        }
                    } else if (!gz0Var3.A()) {
                        if (cy0Var8 == cy0Var9 && cy0Var10.f == null) {
                            int e4 = cy0Var9.e() + d3;
                            gz0Var3.K(e4, gz0Var3.r() + e4);
                            J(i4, ky0Var, gz0Var3, z);
                        } else if (cy0Var8 == cy0Var10 && cy0Var9.f == null) {
                            int e5 = d3 - cy0Var10.e();
                            gz0Var3.K(e5 - gz0Var3.r(), e5);
                            J(i4, ky0Var, gz0Var3, z);
                        } else if (z2 && !gz0Var3.y()) {
                            Z(i4, ky0Var, gz0Var3, z);
                        }
                    }
                }
            }
            gz0Var.m = true;
        }
    }

    public static jx2 K(Object obj) {
        if (obj == null) {
            return jx2.L;
        }
        return new jx2(0, obj);
    }

    public static final boolean L(n6 n6Var) {
        n6Var.getClass();
        if (n6Var instanceof l6) {
            return ((l6) n6Var).a.a.b;
        }
        if (!(n6Var instanceof m6)) {
            i.c();
            return false;
        }
        throw null;
    }

    public static final zy3 M(zy3 zy3Var, sh3 sh3Var, uj3 uj3Var, jf4 jf4Var, boolean z) {
        return zy3Var.f(new xj3(sh3Var, uj3Var, jf4Var, z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [pb5, java.lang.Object] */
    public static fq3 N(fq3 fq3Var) {
        fq3Var.getClass();
        if (fq3Var.isDone()) {
            return fq3Var;
        }
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            R(false, fq3Var, obj, iq2.l());
            obj.a = "nonCancellationPropagating[" + fq3Var + "]";
        } catch (Exception e2) {
            l90Var.b(e2);
        }
        return l90Var;
    }

    public static float O(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return en1.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.jv3.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.P(android.content.Context, java.lang.String):void");
    }

    public static final ti4 Q(n6 n6Var) {
        r15 r15Var;
        int i2;
        if (!(n6Var instanceof l6) || (i2 = (r15Var = ((l6) n6Var).a).b) <= 0) {
            return null;
        }
        return new ti4(Integer.valueOf(i2), Integer.valueOf(r15Var.c));
    }

    public static void R(boolean z, fq3 fq3Var, i90 i90Var, qf1 qf1Var) {
        fq3Var.getClass();
        i90Var.getClass();
        qf1Var.getClass();
        fq3Var.a(new qj2(0, fq3Var, new t71(22, i90Var)), qf1Var);
        if (z) {
            es4 es4Var = new es4(11, fq3Var);
            qf1 l2 = iq2.l();
            pb5 pb5Var = i90Var.c;
            if (pb5Var != null) {
                pb5Var.a(es4Var, l2);
            }
        }
    }

    public static byte[] S(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                i.n(wh1.g(i2, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] T(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.T(java.io.FileInputStream, int, int):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r5 != 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r3.getName().equals("locales") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r1.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String U(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.jv3.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.U(android.content.Context):java.lang.String");
    }

    public static long V(InputStream inputStream, int i2) {
        byte[] S = S(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (S[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static int W(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Preference.DEFAULT_ORDER;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        i.i("Cannot round NaN value.");
        return 0;
    }

    public static int X(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        i.i("Cannot round NaN value.");
        return 0;
    }

    public static long Y(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        i.i("Cannot round NaN value.");
        return 0L;
    }

    public static void Z(int i2, ky0 ky0Var, gz0 gz0Var, boolean z) {
        float f2;
        float f3 = gz0Var.e0;
        cy0 cy0Var = gz0Var.I;
        int d2 = cy0Var.f.d();
        cy0 cy0Var2 = gz0Var.K;
        int d3 = cy0Var2.f.d();
        int e2 = cy0Var.e() + d2;
        int e3 = d3 - cy0Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int r = gz0Var.r();
        int i3 = (d3 - d2) - r;
        if (d2 > d3) {
            i3 = (d2 - d3) - r;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = ((int) f2) + d2;
        int i5 = i4 + r;
        if (d2 > d3) {
            i5 = i4 - r;
        }
        gz0Var.K(i4, i5);
        J(i2 + 1, ky0Var, gz0Var, z);
    }

    public static final void a(String str, float f2, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-303455014);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            fr5 b2 = gr5.b(0.24f * f2);
            wy3 wy3Var = wy3.a;
            zy3 z2 = b53.z(1.0f, C.f, dk7.i(a53.t(o76.h(wy3Var, f2), b2), C.e, iq2.g), b2);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, z2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            if (((Boolean) sk2Var.j(j23.a)).booleanValue()) {
                sk2Var.X(1660904686);
                ev2.a(mh7.N(), null, o76.h(wy3Var, 0.5f * f2), C.i, sk2Var, 48, 0);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                sk2Var.X(1661038110);
                tw2 tw2Var = new tw2((Context) sk2Var.j(ue.b));
                tw2Var.c = str;
                tw2Var.b(true);
                cg2.a(tw2Var.a(), o76.c, ve2.J(sk2Var, R.drawable.ic_trophy), ve2.J(sk2Var, R.drawable.ic_trophy), sk2Var, 37296);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new yl1(str, f2, i2, 3);
        }
    }

    public static void a0(int i2, gz0 gz0Var, ky0 ky0Var, gz0 gz0Var2, boolean z) {
        int r;
        float f2 = gz0Var2.e0;
        cy0 cy0Var = gz0Var2.I;
        int e2 = cy0Var.e() + cy0Var.f.d();
        cy0 cy0Var2 = gz0Var2.K;
        int d2 = cy0Var2.f.d() - cy0Var2.e();
        if (d2 >= e2) {
            int r2 = gz0Var2.r();
            if (gz0Var2.h0 != 8) {
                int i3 = gz0Var2.r;
                if (i3 == 2) {
                    if (gz0Var instanceof hz0) {
                        r = gz0Var.r();
                    } else {
                        r = gz0Var.U.r();
                    }
                    r2 = (int) (gz0Var2.e0 * 0.5f * r);
                } else if (i3 == 0) {
                    r2 = d2 - e2;
                }
                r2 = Math.max(gz0Var2.u, r2);
                int i4 = gz0Var2.v;
                if (i4 > 0) {
                    r2 = Math.min(i4, r2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - r2)) + 0.5f));
            gz0Var2.K(i5, r2 + i5);
            J(i2 + 1, ky0Var, gz0Var2, z);
        }
    }

    public static final void b(n6 n6Var, boolean z, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        sk2 sk2Var;
        dy4 dy4Var;
        URL url;
        float f2;
        mv0 mv0Var;
        String o2;
        long j2;
        i20 i20Var;
        dy4 dy4Var2;
        ml2 ml2Var;
        mv0 mv0Var2;
        dn dnVar;
        dn dnVar2;
        dn dnVar3;
        yd ydVar;
        dn dnVar4;
        lt ltVar;
        jd7 jd7Var;
        float f3;
        mv0 mv0Var3;
        float f4;
        n6Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(476282129);
        if (sk2Var2.f(n6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (sk2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var2.O(i6 & 1, z2)) {
            jd7 C = mj2.C(sk2Var2);
            dy4 a2 = n6Var.a();
            boolean L = L(n6Var);
            ti4 Q = Q(n6Var);
            Object L2 = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = new w7(21, ki2Var);
                sk2Var2.h0(L2);
            }
            b53.d(false, (ki2) L2, sk2Var2, 0, 1);
            s72 s72Var = o76.c;
            long d2 = mh7.d(3859285769L);
            is2 is2Var = iq2.g;
            zy3 i7 = dk7.i(s72Var, d2, is2Var);
            Object L3 = sk2Var2.L();
            if (L3 == sn1Var) {
                L3 = new ox0(5, ki2Var);
                sk2Var2.h0(L3);
            }
            zy3 B = w81.B(i7, (mi2) L3);
            Object L4 = sk2Var2.L();
            if (L4 == sn1Var) {
                L4 = b31.f(sk2Var2);
            }
            l14 l14Var = (l14) L4;
            Object L5 = sk2Var2.L();
            if (L5 == sn1Var) {
                L5 = new w7(22, ki2Var);
                sk2Var2.h0(L5);
            }
            zy3 r = a53.r(B, l14Var, null, false, null, (ki2) L5, 28);
            tv3 d3 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, r);
            nu0.i.getClass();
            mv0 mv0Var4 = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var4);
            } else {
                sk2Var2.k0();
            }
            dn dnVar5 = mu0.f;
            oo2.S(sk2Var2, dnVar5, d3);
            dn dnVar6 = mu0.e;
            oo2.S(sk2Var2, dnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar7 = mu0.g;
            oo2.S(sk2Var2, dnVar7, valueOf);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var2, ydVar2);
            dn dnVar8 = mu0.d;
            oo2.S(sk2Var2, dnVar8, e0);
            h20 h20Var = y60.k0;
            wy3 wy3Var = wy3.a;
            zy3 t = a53.t(o76.l(400.0f, 1, b53.X(wy3Var, 24.0f)), gr5.b(18.0f));
            long j3 = C.c;
            long j4 = C.i;
            long j5 = C.l;
            zy3 z3 = b53.z(1.0f, C.f, dk7.i(t, j3, is2Var), gr5.b(18.0f));
            Object L6 = sk2Var2.L();
            if (L6 == sn1Var) {
                L6 = b31.f(sk2Var2);
            }
            l14 l14Var2 = (l14) L6;
            Object L7 = sk2Var2.L();
            if (L7 == sn1Var) {
                L7 = new d5(17);
                sk2Var2.h0(L7);
            }
            zy3 Y = b53.Y(a53.r(z3, l14Var2, null, false, null, (ki2) L7, 28), 22.0f, 22.0f);
            lr0 a3 = jr0.a(rt.c, h20Var, sk2Var2, 48);
            int hashCode2 = Long.hashCode(sk2Var2.T);
            sm4 l3 = sk2Var2.l();
            zy3 e02 = l07.e0(sk2Var2, Y);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var4);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, a3);
            oo2.S(sk2Var2, dnVar6, l3);
            b31.x(hashCode2, sk2Var2, dnVar7, sk2Var2, ydVar2);
            oo2.S(sk2Var2, dnVar8, e02);
            if (L) {
                dy4Var = a2;
                url = dy4Var.j;
            } else {
                dy4Var = a2;
                url = dy4Var.k;
            }
            String url2 = url.toString();
            url2.getClass();
            a(url2, 84.0f, sk2Var2, 48);
            cg2.k(sk2Var2, o76.d(wy3Var, 14.0f));
            i20 i20Var2 = y60.h0;
            lt ltVar2 = rt.a;
            sr5 a4 = rr5.a(ltVar2, i20Var2, sk2Var2, 48);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            dy4 dy4Var3 = dy4Var;
            zy3 e03 = l07.e0(sk2Var2, wy3Var);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var4);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, a4);
            oo2.S(sk2Var2, dnVar6, l4);
            b31.x(hashCode3, sk2Var2, dnVar7, sk2Var2, ydVar2);
            oo2.S(sk2Var2, dnVar8, e03);
            String a5 = dy4Var3.a();
            long j6 = C.g;
            sd2 sd2Var = td7.a;
            long B2 = hi2.B(17);
            pe2 pe2Var = pe2.d0;
            if (1.0f <= 0.0d) {
                kz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            long j7 = j4;
            ir6.b(a5, new xg3(f2, false), j6, B2, pe2Var, sd2Var, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var2, 1772544, 0, 130448);
            if (dy4Var3.m == cy4.UNOFFICIAL) {
                sk2Var2.X(925545895);
                cg2.k(sk2Var2, o76.k(wy3Var, 8.0f));
                h(sk2Var2, 0);
                sk2Var2.p(false);
            } else {
                sk2Var2.X(925647761);
                sk2Var2.p(false);
            }
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.d(wy3Var, 8.0f));
            sr5 a6 = rr5.a(ltVar2, i20Var2, sk2Var2, 48);
            int hashCode4 = Long.hashCode(sk2Var2.T);
            sm4 l5 = sk2Var2.l();
            zy3 e04 = l07.e0(sk2Var2, wy3Var);
            sk2Var2.b0();
            if (sk2Var2.S) {
                mv0Var = mv0Var4;
                sk2Var2.k(mv0Var);
            } else {
                mv0Var = mv0Var4;
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar5, a6);
            oo2.S(sk2Var2, dnVar6, l5);
            b31.x(hashCode4, sk2Var2, dnVar7, sk2Var2, ydVar2);
            oo2.S(sk2Var2, dnVar8, e04);
            if (L) {
                o2 = b31.o(sk2Var2, 1857402206, R.string.retro_achievements_unlocked, sk2Var2, false);
            } else {
                o2 = b31.o(sk2Var2, 1857499360, R.string.retro_achievements_locked, sk2Var2, false);
            }
            zy3 t2 = a53.t(o76.h(wy3Var, 7.0f), gr5.a());
            if (L) {
                j2 = j5;
            } else {
                j2 = j7;
            }
            d50.a(dk7.i(t2, j2, is2Var), sk2Var2, 0);
            cg2.k(sk2Var2, o76.k(wy3Var, 6.0f));
            Locale locale = Locale.ROOT;
            String upperCase = o2.toUpperCase(locale);
            upperCase.getClass();
            if (L) {
                j7 = j5;
            }
            ml2 ml2Var2 = td7.c;
            long A = hi2.A(9.5d);
            mv0 mv0Var5 = mv0Var;
            pe2 pe2Var2 = pe2.c0;
            ir6.b(upperCase, null, j7, A, pe2Var2, ml2Var2, hi2.A(0.6d), null, 0L, 0, false, 0, 0, null, null, sk2Var2, 14355456, 0, 130834);
            cg2.k(sk2Var2, o76.k(wy3Var, 10.0f));
            String g2 = wh1.g(dy4Var3.h, "· ");
            long j8 = jd7.p;
            ir6.b(g2, null, j8, hi2.A(9.5d), pe2Var2, ml2Var2, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 1772928, 0, 130962);
            cg2.k(sk2Var2, o76.k(wy3Var, 3.0f));
            String upperCase2 = me2.X(sk2Var2, R.string.points).toUpperCase(locale);
            upperCase2.getClass();
            ir6.b(upperCase2, null, j8, hi2.B(8), null, ml2Var2, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 1576320, 0, 130994);
            sk2Var2.p(true);
            cg2.k(sk2Var2, o76.d(wy3Var, 14.0f));
            jd7 jd7Var2 = C;
            ir6.b(dy4Var3.g, null, C.h, hi2.B(13), null, null, 0L, new kn6(3), hi2.B(19), 0, false, 0, 0, null, null, sk2Var2, 3072, 6, 129522);
            sk2 sk2Var3 = sk2Var2;
            if (Q != null) {
                Object obj = Q.A;
                Object obj2 = Q.B;
                sk2Var3.X(157436200);
                cg2.k(sk2Var3, o76.d(wy3Var, 16.0f));
                zy3 c2 = o76.c(wy3Var, 1.0f);
                sr5 a7 = rr5.a(ltVar2, i20Var2, sk2Var3, 48);
                int hashCode5 = Long.hashCode(sk2Var3.T);
                sm4 l6 = sk2Var3.l();
                zy3 e05 = l07.e0(sk2Var3, c2);
                sk2Var3.b0();
                if (sk2Var3.S) {
                    mv0Var3 = mv0Var5;
                    sk2Var3.k(mv0Var3);
                } else {
                    mv0Var3 = mv0Var5;
                    sk2Var3.k0();
                }
                oo2.S(sk2Var3, dnVar5, a7);
                oo2.S(sk2Var3, dnVar6, l6);
                b31.x(hashCode5, sk2Var3, dnVar7, sk2Var3, ydVar2);
                oo2.S(sk2Var3, dnVar8, e05);
                dy4Var2 = dy4Var3;
                if (1.0f <= 0.0d) {
                    kz2.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f4 = Float.MAX_VALUE;
                } else {
                    f4 = 1.0f;
                }
                zy3 i8 = dk7.i(a53.t(o76.d(new xg3(f4, true), 6.0f), gr5.b(3.0f)), jd7Var2.d, is2Var);
                tv3 d4 = d50.d(y60.L, false);
                i20Var = i20Var2;
                int hashCode6 = Long.hashCode(sk2Var3.T);
                sm4 l7 = sk2Var3.l();
                zy3 e06 = l07.e0(sk2Var3, i8);
                sk2Var3.b0();
                if (sk2Var3.S) {
                    sk2Var3.k(mv0Var3);
                } else {
                    sk2Var3.k0();
                }
                oo2.S(sk2Var3, dnVar5, d4);
                oo2.S(sk2Var3, dnVar6, l7);
                b31.x(hashCode6, sk2Var3, dnVar7, sk2Var3, ydVar2);
                oo2.S(sk2Var3, dnVar8, e06);
                int intValue = ((Number) obj2).intValue();
                float f5 = RecyclerView.A1;
                if (intValue != 0) {
                    f5 = io2.l(((Number) obj).intValue() / ((Number) obj2).floatValue(), RecyclerView.A1, 1.0f);
                }
                d50.a(dk7.i(a53.t(o76.d(o76.c(wy3Var, f5), 6.0f), gr5.b(3.0f)), j5, is2Var), sk2Var3, 0);
                sk2Var3.p(true);
                cg2.k(sk2Var3, o76.k(wy3Var, 10.0f));
                jd7Var2 = jd7Var2;
                dnVar3 = dnVar7;
                ml2Var = ml2Var2;
                mv0Var2 = mv0Var3;
                dnVar4 = dnVar8;
                ydVar = ydVar2;
                ltVar = ltVar2;
                dnVar = dnVar5;
                dnVar2 = dnVar6;
                ir6.b(me2.W(R.string.achievement_progress, new Object[]{obj, obj2}, sk2Var3), null, jd7Var2.i, hi2.B(10), null, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var3, 1575936, 0, 130994);
                sk2Var3 = sk2Var3;
                sk2Var3.p(true);
                sk2Var3.p(false);
            } else {
                i20Var = i20Var2;
                dy4Var2 = dy4Var3;
                ml2Var = ml2Var2;
                mv0Var2 = mv0Var5;
                dnVar = dnVar5;
                dnVar2 = dnVar6;
                dnVar3 = dnVar7;
                ydVar = ydVar2;
                dnVar4 = dnVar8;
                ltVar = ltVar2;
                sk2Var3.X(158709525);
                sk2Var3.p(false);
            }
            if (z) {
                sk2Var3.X(158756707);
                cg2.k(sk2Var3, o76.d(wy3Var, 12.0f));
                sk2 sk2Var4 = sk2Var3;
                jd7Var = jd7Var2;
                f3 = 12.0f;
                ir6.b(me2.X(sk2Var3, R.string.offline_ra_in_ledger_badge), null, jd7Var2.l, hi2.B(10), pe2Var2, ml2Var, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var4, 1772544, 0, 130962);
                sk2Var3 = sk2Var4;
                sk2Var3.p(false);
            } else {
                jd7Var = jd7Var2;
                f3 = 12.0f;
                sk2Var3.X(159112277);
                sk2Var3.p(false);
            }
            if (dy4Var2.b()) {
                sk2Var3.X(159178555);
                cg2.k(sk2Var3, o76.d(wy3Var, f3));
                sr5 a8 = rr5.a(ltVar, i20Var, sk2Var3, 48);
                int hashCode7 = Long.hashCode(sk2Var3.T);
                sm4 l8 = sk2Var3.l();
                zy3 e07 = l07.e0(sk2Var3, wy3Var);
                sk2Var3.b0();
                if (sk2Var3.S) {
                    sk2Var3.k(mv0Var2);
                } else {
                    sk2Var3.k0();
                }
                oo2.S(sk2Var3, dnVar, a8);
                oo2.S(sk2Var3, dnVar2, l8);
                b31.x(hashCode7, sk2Var3, dnVar3, sk2Var3, ydVar);
                oo2.S(sk2Var3, dnVar4, e07);
                ev2.b(ve2.J(sk2Var3, R.drawable.ic_status_warn), null, o76.h(wy3Var, 15.0f), j8, sk2Var3, 3512, 0);
                cg2.k(sk2Var3, o76.k(wy3Var, 6.0f));
                sk2 sk2Var5 = sk2Var3;
                ir6.b(me2.X(sk2Var3, R.string.achievement_missable_description), null, jd7Var.i, hi2.B(11), null, null, 0L, null, hi2.B(15), 0, false, 0, 0, null, null, sk2Var5, 3072, 6, 130034);
                sk2Var3 = sk2Var5;
                sk2Var3.p(true);
                sk2Var3.p(false);
            } else {
                sk2Var3.X(159910837);
                sk2Var3.p(false);
            }
            cg2.k(sk2Var3, o76.d(wy3Var, 18.0f));
            sk2 sk2Var6 = sk2Var3;
            oo2.b(l07.b0(new lk2("B", me2.X(sk2Var3, R.string.pause_hint_back))), null, false, sk2Var6, RendererDebugBridge.CAPTURE_HEIGHT, 2);
            sk2Var = sk2Var6;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new z51(n6Var, z, ki2Var, i2, 1);
        }
    }

    public static void b0(int i2, ky0 ky0Var, gz0 gz0Var) {
        float f2;
        float f3 = gz0Var.f0;
        cy0 cy0Var = gz0Var.J;
        int d2 = cy0Var.f.d();
        cy0 cy0Var2 = gz0Var.L;
        int d3 = cy0Var2.f.d();
        int e2 = cy0Var.e() + d2;
        int e3 = d3 - cy0Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int l2 = gz0Var.l();
        int i3 = (d3 - d2) - l2;
        if (d2 > d3) {
            i3 = (d2 - d3) - l2;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = (int) f2;
        int i5 = d2 + i4;
        int i6 = i5 + l2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - l2;
        }
        gz0Var.L(i5, i6);
        g0(i2 + 1, ky0Var, gz0Var);
    }

    public static final void c(ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(584970726);
        if (sk2Var.h(ki2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            xq0 xq0Var = new xq0(xq0.b);
            long j2 = xq0.g;
            up.c(dk7.h(wy3.a, sn1.o(l07.c0(xq0Var, new xq0(j2)), RecyclerView.A1, RecyclerView.A1, 14)), ct3.H0(-1286564128, new sz(ki2Var, 0, (byte) 0), sk2Var), null, j2, xq0.d, RecyclerView.A1, sk2Var, 1794486);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sz(i2, ki2Var);
        }
    }

    public static void c0(int i2, gz0 gz0Var, ky0 ky0Var, gz0 gz0Var2) {
        int l2;
        float f2 = gz0Var2.f0;
        cy0 cy0Var = gz0Var2.J;
        int e2 = cy0Var.e() + cy0Var.f.d();
        cy0 cy0Var2 = gz0Var2.L;
        int d2 = cy0Var2.f.d() - cy0Var2.e();
        if (d2 >= e2) {
            int l3 = gz0Var2.l();
            if (gz0Var2.h0 != 8) {
                int i3 = gz0Var2.s;
                if (i3 == 2) {
                    if (gz0Var instanceof hz0) {
                        l2 = gz0Var.l();
                    } else {
                        l2 = gz0Var.U.l();
                    }
                    l3 = (int) (f2 * 0.5f * l2);
                } else if (i3 == 0) {
                    l3 = d2 - e2;
                }
                l3 = Math.max(gz0Var2.x, l3);
                int i4 = gz0Var2.y;
                if (i4 > 0) {
                    l3 = Math.min(i4, l3);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - l3)) + 0.5f));
            gz0Var2.L(i5, l3 + i5);
            g0(i2 + 1, ky0Var, gz0Var2);
        }
    }

    public static final void d(vy vyVar, g56 g56Var, gn gnVar, ki2 ki2Var, tu0 tu0Var, int i2) {
        vy vyVar2;
        int i3;
        boolean z;
        sk2 sk2Var;
        int i4;
        int i5;
        int i6;
        int i7;
        g56Var.getClass();
        gnVar.getClass();
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(149535180);
        if ((i2 & 6) == 0) {
            vyVar2 = vyVar;
            if (sk2Var2.h(vyVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            vyVar2 = vyVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var2.f(g56Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.h(gnVar)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var2.h(ki2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i3 & 1, z)) {
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.TRUE);
                sk2Var2.h0(L);
            }
            k24 k24Var = (k24) L;
            Context context = (Context) sk2Var2.j(ue.b);
            View view = (View) sk2Var2.j(ue.f);
            boolean f2 = sk2Var2.f(context) | sk2Var2.f(view);
            Object L2 = sk2Var2.L();
            if (f2 || L2 == sn1Var) {
                context.getClass();
                L2 = new cg7(((Activity) context).getWindow(), view);
                sk2Var2.h0(L2);
            }
            cg7 cg7Var = (cg7) L2;
            cg7Var.getClass();
            Boolean bool = (Boolean) k24Var.getValue();
            bool.booleanValue();
            boolean h2 = sk2Var2.h(cg7Var);
            Object L3 = sk2Var2.L();
            if (h2 || L3 == sn1Var) {
                L3 = new n5(cg7Var, k24Var, (j11) null, 4);
                sk2Var2.h0(L3);
            }
            l.g(sk2Var2, (aj2) L3, bool);
            boolean h3 = sk2Var2.h(cg7Var);
            Object L4 = sk2Var2.L();
            if (h3 || L4 == sn1Var) {
                L4 = new j0(12, cg7Var);
                sk2Var2.h0(L4);
            }
            l.d(cg7Var, (mi2) L4, sk2Var2);
            sk2Var = sk2Var2;
            ru5.a(null, null, null, null, null, null, 0, false, null, RecyclerView.A1, 0L, 0L, 0L, xq0.b, 0L, ct3.H0(1815374670, new qz(g56Var, vyVar2, gnVar, context, k24Var, ki2Var, 0), sk2Var2), sk2Var, 0);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rz(vyVar, g56Var, gnVar, ki2Var, i2, 0);
        }
    }

    public static final String d0(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static final void e(zy3 zy3Var, Cheat cheat, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        ki2 ki2Var4;
        String description;
        boolean z2;
        k24 k24Var;
        l14 l14Var;
        long j2;
        boolean z3;
        k24 k24Var2;
        boolean z4;
        int i4;
        int i5;
        int i6;
        zy3Var.getClass();
        cheat.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1297853370);
        if (sk2Var.f(cheat)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i3 | i2;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(ki2Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(ki2Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var.h(ki2Var3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i7 |= i4;
        }
        int i8 = i7;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            if (cheat.getDescription() != null && (!zg6.B0(description))) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.FALSE);
                sk2Var.h0(L);
            }
            k24 k24Var3 = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                wc2 wc2Var = wc2.b;
                L2 = vc2.a;
                sk2Var.h0(L2);
            }
            ((vc2) L2).getClass();
            wc2 wc2Var2 = new wc2();
            wc2 wc2Var3 = new wc2();
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = b31.f(sk2Var);
            }
            l14 l14Var2 = (l14) L3;
            k24 a2 = bh7.a(l14Var2, sk2Var, 6);
            fr5 b2 = gr5.b(13.0f);
            zy3 t = a53.t(zy3Var, b2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                k24Var = k24Var3;
                l14Var = l14Var2;
                j2 = C.e;
            } else {
                k24Var = k24Var3;
                l14Var = l14Var2;
                j2 = C.d;
            }
            zy3 i9 = dk7.i(t, j2, iq2.g);
            if (((Boolean) a2.getValue()).booleanValue()) {
                i9 = b53.z(2.0f, C.j, i9, b2);
            }
            zy3 I = b53.I(i9, wc2Var2);
            boolean f2 = sk2Var.f(wc2Var3);
            Object L4 = sk2Var.L();
            if (f2 || L4 == sn1Var) {
                L4 = new vl0(wc2Var3, 0);
                sk2Var.h0(L4);
            }
            k24 k24Var4 = k24Var;
            zy3 r = a53.r(a53.C(I, (mi2) L4), l14Var, null, false, null, ki2Var, 28);
            Object L5 = sk2Var.L();
            if (L5 == sn1Var) {
                L5 = new wl0(k24Var4, 0);
                sk2Var.h0(L5);
            }
            zy3 a0 = b53.a0(w81.A(r, (mi2) L5), 14.0f, 11.0f, 6.0f, 11.0f);
            sr5 a3 = rr5.a(new ot(10.0f, true, new i(1)), y60.h0, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, a0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a3);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a4 = jr0.a(new ot(3.0f, true, new i(1)), y60.j0, sk2Var, 6);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(cheat.getName(), null, C.g, hi2.A(13.5d), pe2.Z, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, 199680, 3120, 120786);
            sk2 sk2Var2 = sk2Var;
            if (z2) {
                sk2Var2.X(1179612777);
                String description2 = cheat.getDescription();
                description2.getClass();
                ir6.b(description2, null, C.i, hi2.A(11.5d), null, null, 0L, null, hi2.B(15), 2, false, 2, 0, null, null, sk2Var2, 3072, 3126, 119794);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            } else {
                sk2Var2.X(1179896706);
                sk2Var2.p(false);
            }
            if (!zg6.B0(cheat.getCode())) {
                sk2Var2.X(1179965712);
                sk2 sk2Var3 = sk2Var2;
                ir6.b(zg6.Z0(gh6.k0(cheat.getCode(), '\n', ' ')).toString(), null, C.i, hi2.A(9.5d), null, td7.c, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var3, 1575936, 3120, 120754);
                sk2Var2 = sk2Var3;
                z3 = false;
                sk2Var2.p(false);
            } else {
                z3 = false;
                sk2Var2.X(1180273666);
                sk2Var2.p(false);
            }
            sk2Var2.p(true);
            tv3 d2 = d50.d(y60.L, z3);
            int hashCode3 = Long.hashCode(sk2Var2.T);
            sm4 l4 = sk2Var2.l();
            wy3 wy3Var = wy3.a;
            zy3 e03 = l07.e0(sk2Var2, wy3Var);
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, dnVar, d2);
            oo2.S(sk2Var2, dnVar2, l4);
            b31.x(hashCode3, sk2Var2, dnVar3, sk2Var2, ydVar);
            oo2.S(sk2Var2, dnVar4, e03);
            ax2 J = oo2.J();
            String X = me2.X(sk2Var2, R.string.options);
            long j3 = C.i;
            zy3 I2 = b53.I(a53.t(o76.h(wy3Var, 34.0f), gr5.b(8.0f)), wc2Var3);
            boolean f3 = sk2Var2.f(wc2Var2);
            Object L6 = sk2Var2.L();
            if (f3 || L6 == sn1Var) {
                L6 = new vl0(wc2Var2, 1);
                sk2Var2.h0(L6);
            }
            zy3 C2 = a53.C(I2, (mi2) L6);
            Object L7 = sk2Var2.L();
            if (L7 == sn1Var) {
                k24Var2 = k24Var4;
                L7 = new f4(k24Var2, 9);
                sk2Var2.h0(L7);
            } else {
                k24Var2 = k24Var4;
            }
            ev2.a(J, X, b53.X(a53.s(C2, false, null, (ki2) L7, 15), 7.0f), j3, sk2Var2, 0, 0);
            boolean booleanValue = ((Boolean) k24Var2.getValue()).booleanValue();
            Object L8 = sk2Var2.L();
            if (L8 == sn1Var) {
                L8 = new f4(k24Var2, 10);
                sk2Var2.h0(L8);
            }
            ki2Var4 = ki2Var3;
            sk2 sk2Var4 = sk2Var2;
            hi.a(booleanValue, (ki2) L8, null, 0L, null, null, ct3.H0(-1291925597, new az(ki2Var2, ki2Var4, k24Var2, 1), sk2Var2), sk2Var4, 1572912);
            sk2Var = sk2Var4;
            sk2Var.p(true);
            cg2.k(sk2Var, o76.k(wy3Var, 2.0f));
            boolean enabled = cheat.getEnabled();
            if ((i8 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L9 = sk2Var.L();
            if (z4 || L9 == sn1Var) {
                L9 = new el0(2, ki2Var);
                sk2Var.h0(L9);
            }
            oo2.o(enabled, (mi2) L9, null, false, sk2Var, 0, 12);
            sk2Var.p(true);
        } else {
            ki2Var4 = ki2Var3;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new r4(zy3Var, (Object) cheat, (Object) ki2Var, (Object) ki2Var2, (wi2) ki2Var4, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ku0, n45] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList e0(v86 v86Var, int i2, Integer num) {
        Object obj;
        ?? n45Var = new n45(v86Var);
        int q = v86Var.q(i2);
        mk2 a2 = v86Var.a(i2);
        while (i2 >= 0) {
            if (v86Var.k(i2)) {
                obj = v86Var.p(v86Var.b, i2);
            } else {
                obj = su0.a;
            }
            n45Var.i(v86Var.i(i2), obj, v86Var.a.k(i2), num);
            if (q >= 0) {
                mk2 mk2Var = a2;
                a2 = v86Var.a(q);
                i2 = q;
                q = v86Var.q(q);
                num = mk2Var;
            } else {
                i2 = q;
                num = a2;
            }
        }
        return (ArrayList) n45Var.a;
    }

    public static final void f(bq6 bq6Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2080741862);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(bq6Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            w81.c(bq6Var, et0Var, sk2Var, i3 & 126);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ds0(bq6Var, et0Var, i2, 1);
        }
    }

    public static cj0 f0(fq3 fq3Var, iv ivVar, Executor executor) {
        cj0 cj0Var = new cj0(ivVar, fq3Var);
        fq3Var.a(cj0Var, executor);
        return cj0Var;
    }

    public static final void g(final rg5 rg5Var, final String str, final mj5 mj5Var, final pp5 pp5Var, final r94 r94Var, final ki2 ki2Var, final mi2 mi2Var, final mi2 mi2Var2, final ki2 ki2Var2, final aj2 aj2Var, final ki2 ki2Var3, final mi2 mi2Var3, final ki2 ki2Var4, final ki2 ki2Var5, final ki2 ki2Var6, final mi2 mi2Var4, final aj2 aj2Var2, tu0 tu0Var, final int i2) {
        sk2 sk2Var;
        rg5Var.getClass();
        mj5Var.getClass();
        pp5Var.getClass();
        r94Var.getClass();
        ki2Var.getClass();
        mi2Var.getClass();
        mi2Var2.getClass();
        ki2Var2.getClass();
        aj2Var.getClass();
        ki2Var3.getClass();
        mi2Var3.getClass();
        ki2Var4.getClass();
        ki2Var5.getClass();
        ki2Var6.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-344528107);
        int i3 = i2 | (sk2Var2.h(rg5Var) ? 4 : 2) | (sk2Var2.f(str) ? 32 : 16) | (sk2Var2.f(mj5Var) ? 2048 : 1024) | (sk2Var2.f(pp5Var) ? 16384 : 8192) | (sk2Var2.f(r94Var) ? 131072 : 65536) | (sk2Var2.h(ki2Var) ? 1048576 : 524288) | (sk2Var2.h(mi2Var) ? 8388608 : 4194304) | (sk2Var2.h(mi2Var2) ? 67108864 : 33554432) | (sk2Var2.h(ki2Var2) ? 536870912 : 268435456);
        int i4 = (sk2Var2.h(aj2Var) ? (char) 4 : (char) 2) | (sk2Var2.h(ki2Var3) ? ' ' : (char) 16) | (sk2Var2.h(mi2Var3) ? 256 : 128) | (sk2Var2.h(ki2Var4) ? 2048 : 1024) | (sk2Var2.h(ki2Var5) ? 16384 : 8192) | (sk2Var2.h(ki2Var6) ? (char) 0 : (char) 0) | (sk2Var2.h(mi2Var4) ? (char) 0 : (char) 0) | (sk2Var2.h(aj2Var2) ? (char) 0 : (char) 0);
        if (sk2Var2.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            final jd7 C = mj2.C(sk2Var2);
            int tabIndex = gl5.CONFIG.getTabIndex();
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new vq3(25);
                sk2Var2.h0(L);
            }
            ki2 ki2Var7 = (ki2) L;
            mi4 mi4Var = ni4.a;
            Object[] objArr = new Object[0];
            ci3 ci3Var = ya1.G;
            boolean c2 = sk2Var2.c(RecyclerView.A1);
            Object L2 = sk2Var2.L();
            if (c2 || L2 == sn1Var) {
                L2 = new li4(tabIndex, ki2Var7);
                sk2Var2.h0(L2);
            }
            final ya1 ya1Var = (ya1) jk2.N(objArr, ci3Var, (ki2) L2, sk2Var2, 0);
            ya1Var.F.setValue(ki2Var7);
            Integer valueOf = Integer.valueOf(ya1Var.k());
            boolean f2 = ((i4 & 3670016) == 1048576) | sk2Var2.f(ya1Var) | ((i4 & 29360128) == 8388608);
            Object L3 = sk2Var2.L();
            if (f2 || L3 == sn1Var) {
                L3 = new ug(ya1Var, mi2Var4, aj2Var2, null, 9);
                sk2Var2.h0(L3);
            }
            l.g(sk2Var2, (aj2) L3, valueOf);
            Object L4 = sk2Var2.L();
            if (L4 == sn1Var) {
                L4 = new wc2();
                sk2Var2.h0(L4);
            }
            final wc2 wc2Var = (wc2) L4;
            Object L5 = sk2Var2.L();
            if (L5 == sn1Var) {
                int b2 = ((k0) gl5.getEntries()).b();
                ArrayList arrayList = new ArrayList(b2);
                for (int i5 = 0; i5 < b2; i5++) {
                    arrayList.add(new wc2());
                }
                sk2Var2.h0(arrayList);
                L5 = arrayList;
            }
            final List list = (List) L5;
            Object L6 = sk2Var2.L();
            if (L6 == sn1Var) {
                L6 = l.A(sk2Var2);
                sk2Var2.h0(L6);
            }
            o31 o31Var = (o31) L6;
            boolean f3 = sk2Var2.f(o31Var) | sk2Var2.f(ya1Var);
            Object L7 = sk2Var2.L();
            if (f3 || L7 == sn1Var) {
                L7 = new cz(o31Var, ya1Var, list, 20);
                sk2Var2.h0(L7);
            }
            final mi2 mi2Var5 = (mi2) L7;
            boolean z = de7.a(sk2Var2, 1).a.a >= 600;
            boolean f4 = sk2Var2.f(ya1Var) | sk2Var2.f(mi2Var5) | ((i3 & 29360128) == 8388608) | sk2Var2.h(rg5Var);
            Object L8 = sk2Var2.L();
            if (f4 || L8 == sn1Var) {
                L8 = new fl5(ya1Var, mi2Var5, mi2Var, rg5Var);
                sk2Var2.h0(L8);
            }
            zy3 B = w81.B(wy3.a, (mi2) L8);
            sk2Var = sk2Var2;
            final et0 H0 = ct3.H0(577548834, new bj2() { // from class: bl5
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z2;
                    int i6;
                    final ih4 ih4Var = (ih4) obj;
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ih4Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((sk2) tu0Var2).f(ih4Var)) {
                            i6 = 4;
                        } else {
                            i6 = 2;
                        }
                        intValue |= i6;
                    }
                    if ((intValue & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sk2 sk2Var3 = (sk2) tu0Var2;
                    if (sk2Var3.O(intValue & 1, z2)) {
                        s72 s72Var = o76.c;
                        final List list2 = list;
                        final rg5 rg5Var2 = rg5Var;
                        final mj5 mj5Var2 = mj5Var;
                        final mi2 mi2Var6 = mi2Var2;
                        final ki2 ki2Var8 = ki2Var2;
                        final aj2 aj2Var3 = aj2Var2;
                        final pp5 pp5Var2 = pp5Var;
                        final r94 r94Var2 = r94Var;
                        final aj2 aj2Var4 = aj2Var;
                        final ki2 ki2Var9 = ki2Var3;
                        final mi2 mi2Var7 = mi2Var3;
                        final ki2 ki2Var10 = ki2Var4;
                        final mi2 mi2Var8 = mi2Var4;
                        ln2.g(ya1.this, s72Var, null, null, null, null, false, null, null, null, ct3.H0(-755415069, new cj2() { // from class: el5
                            @Override // defpackage.cj2
                            public final Object q(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int intValue2 = ((Integer) obj5).intValue();
                                tu0 tu0Var3 = (tu0) obj6;
                                ((Integer) obj7).getClass();
                                ((ai4) obj4).getClass();
                                wc2 wc2Var2 = (wc2) list2.get(intValue2);
                                int tabIndex2 = gl5.CONFIG.getTabIndex();
                                ih4 ih4Var2 = ih4Var;
                                Object obj8 = su0.a;
                                if (intValue2 == tabIndex2) {
                                    sk2 sk2Var4 = (sk2) tu0Var3;
                                    sk2Var4.X(1058462580);
                                    zy3 I = b53.I(o76.c, wc2Var2);
                                    aj2 aj2Var5 = aj2Var3;
                                    boolean f5 = sk2Var4.f(aj2Var5);
                                    Object L9 = sk2Var4.L();
                                    if (f5 || L9 == obj8) {
                                        L9 = new cq3(2, aj2Var5);
                                        sk2Var4.h0(L9);
                                    }
                                    nl2.l(I, ih4Var2, rg5Var2, mj5Var2, mi2Var6, ki2Var8, (aj2) L9, sk2Var4, 0);
                                    sk2Var4.p(false);
                                } else {
                                    int tabIndex3 = gl5.RETRO_ACHIEVEMENTS.getTabIndex();
                                    r94 r94Var3 = r94Var2;
                                    ki2 ki2Var11 = ki2Var10;
                                    if (intValue2 == tabIndex3) {
                                        sk2 sk2Var5 = (sk2) tu0Var3;
                                        sk2Var5.X(1059079852);
                                        zy3 I2 = b53.I(o76.c, wc2Var2);
                                        mi2 mi2Var9 = mi2Var8;
                                        boolean f6 = sk2Var5.f(mi2Var9);
                                        Object L10 = sk2Var5.L();
                                        if (f6 || L10 == obj8) {
                                            L10 = new hz(22, mi2Var9);
                                            sk2Var5.h0(L10);
                                        }
                                        l07.j(I2, ih4Var2, pp5Var2, r94Var3, aj2Var4, ki2Var9, mi2Var7, ki2Var11, null, null, (mi2) L10, sk2Var5, 0);
                                        sk2Var5.p(false);
                                    } else if (intValue2 == gl5.OFFLINE_ACHIEVEMENTS.getTabIndex()) {
                                        sk2 sk2Var6 = (sk2) tu0Var3;
                                        sk2Var6.X(1059849923);
                                        gk2.k(b53.I(o76.c, wc2Var2), ih4Var2, r94Var3, ki2Var11, sk2Var6, 0);
                                        sk2Var6.p(false);
                                    } else {
                                        sk2 sk2Var7 = (sk2) tu0Var3;
                                        sk2Var7.X(1060228991);
                                        sk2Var7.p(false);
                                    }
                                }
                                return o27.a;
                            }
                        }, sk2Var3), sk2Var3, 100663344);
                    } else {
                        sk2Var3.R();
                    }
                    return o27.a;
                }
            }, sk2Var);
            long j2 = C.b;
            zy3 f5 = o76.c.f(B);
            final boolean z2 = z;
            mj2.f(f5, null, j2, 0L, RecyclerView.A1, ct3.H0(2020246609, new aj2() { // from class: cl5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v6 */
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    boolean z3;
                    wc2 wc2Var2;
                    sk2 sk2Var3;
                    j11 j11Var;
                    dn dnVar;
                    s67 s67Var = mh7.o;
                    tu0 tu0Var2 = (tu0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    h20 h20Var = y60.j0;
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sk2 sk2Var4 = (sk2) tu0Var2;
                    if (sk2Var4.O(intValue & 1, z3)) {
                        boolean z4 = z2;
                        wc2 wc2Var3 = wc2Var;
                        rg5 rg5Var2 = rg5Var;
                        String str2 = str;
                        mi2 mi2Var6 = mi2Var;
                        ki2 ki2Var8 = ki2Var;
                        ki2 ki2Var9 = ki2Var5;
                        ki2 ki2Var10 = ki2Var6;
                        ya1 ya1Var2 = ya1Var;
                        mi2 mi2Var7 = mi2Var5;
                        et0 et0Var = H0;
                        mt mtVar = rt.c;
                        sn1 sn1Var2 = su0.a;
                        if (z4) {
                            sk2Var4.X(-209936249);
                            s72 s72Var = o76.c;
                            zy3 m0 = mh7.m0(s72Var, s67Var);
                            sr5 a2 = rr5.a(rt.a, y60.g0, sk2Var4, 0);
                            int hashCode = Long.hashCode(sk2Var4.T);
                            sm4 l2 = sk2Var4.l();
                            zy3 e0 = l07.e0(sk2Var4, m0);
                            nu0.i.getClass();
                            mv0 mv0Var = mu0.b;
                            sk2Var4.b0();
                            if (sk2Var4.S) {
                                sk2Var4.k(mv0Var);
                            } else {
                                sk2Var4.k0();
                            }
                            dn dnVar2 = mu0.f;
                            oo2.S(sk2Var4, dnVar2, a2);
                            dn dnVar3 = mu0.e;
                            oo2.S(sk2Var4, dnVar3, l2);
                            Integer valueOf2 = Integer.valueOf(hashCode);
                            dn dnVar4 = mu0.g;
                            oo2.S(sk2Var4, dnVar4, valueOf2);
                            yd ydVar = mu0.h;
                            oo2.P(sk2Var4, ydVar);
                            dn dnVar5 = mu0.d;
                            oo2.S(sk2Var4, dnVar5, e0);
                            boolean f6 = sk2Var4.f(mi2Var6) | sk2Var4.h(rg5Var2);
                            Object L9 = sk2Var4.L();
                            if (!f6 && L9 != sn1Var2) {
                                dnVar = dnVar3;
                            } else {
                                dnVar = dnVar3;
                                L9 = new gk5(mi2Var6, rg5Var2, 1);
                                sk2Var4.h0(L9);
                            }
                            wc2Var2 = wc2Var3;
                            dn dnVar6 = dnVar;
                            f34.j(rg5Var2, str2, wc2Var2, (ki2) L9, ki2Var8, ki2Var9, ki2Var10, null, sk2Var4, 3072);
                            sk2Var3 = sk2Var4;
                            zy3 i6 = dk7.i(s72Var, C.b, iq2.g);
                            lr0 a3 = jr0.a(mtVar, h20Var, sk2Var3, 0);
                            int hashCode2 = Long.hashCode(sk2Var3.T);
                            sm4 l3 = sk2Var3.l();
                            zy3 e02 = l07.e0(sk2Var3, i6);
                            sk2Var3.b0();
                            if (sk2Var3.S) {
                                sk2Var3.k(mv0Var);
                            } else {
                                sk2Var3.k0();
                            }
                            oo2.S(sk2Var3, dnVar2, a3);
                            oo2.S(sk2Var3, dnVar6, l3);
                            b31.x(hashCode2, sk2Var3, dnVar4, sk2Var3, ydVar);
                            oo2.S(sk2Var3, dnVar5, e02);
                            f34.i((gl5) ((f12) gl5.getEntries()).get(ya1Var2.k()), mi2Var7, null, sk2Var3, 0);
                            et0Var.i(b53.q(3, RecyclerView.A1), sk2Var3, 54);
                            sk2Var3.p(true);
                            sk2Var3.p(true);
                            sk2Var3.p(false);
                            j11Var = null;
                        } else {
                            sk2Var4.X(-209065335);
                            s72 s72Var2 = o76.c;
                            lr0 a4 = jr0.a(mtVar, h20Var, sk2Var4, 0);
                            int hashCode3 = Long.hashCode(sk2Var4.T);
                            sm4 l4 = sk2Var4.l();
                            zy3 e03 = l07.e0(sk2Var4, s72Var2);
                            nu0.i.getClass();
                            mv0 mv0Var2 = mu0.b;
                            sk2Var4.b0();
                            if (sk2Var4.S) {
                                sk2Var4.k(mv0Var2);
                            } else {
                                sk2Var4.k0();
                            }
                            oo2.S(sk2Var4, mu0.f, a4);
                            oo2.S(sk2Var4, mu0.e, l4);
                            oo2.S(sk2Var4, mu0.g, Integer.valueOf(hashCode3));
                            oo2.P(sk2Var4, mu0.h);
                            oo2.S(sk2Var4, mu0.d, e03);
                            boolean f7 = sk2Var4.f(mi2Var6) | sk2Var4.h(rg5Var2);
                            Object L10 = sk2Var4.L();
                            if (f7 || L10 == sn1Var2) {
                                L10 = new gk5(mi2Var6, rg5Var2, 2);
                                sk2Var4.h0(L10);
                            }
                            wc2Var2 = wc2Var3;
                            f34.k(rg5Var2, str2, wc2Var2, L10, ki2Var8, ki2Var9, ki2Var10, mh7.m0(wy3.a, s67Var), sk2Var4, 3072);
                            sk2Var3 = sk2Var4;
                            j11Var = null;
                            f34.i((gl5) ((f12) gl5.getEntries()).get(ya1Var2.k()), mi2Var7, null, sk2Var3, 0);
                            et0Var.i(b53.q(3, RecyclerView.A1), sk2Var3, 54);
                            sk2Var3.p(true);
                            sk2Var3.p(false);
                        }
                        Object L11 = sk2Var3.L();
                        if (L11 == sn1Var2) {
                            L11 = new kl0(wc2Var2, j11Var, 2);
                            sk2Var3.h0(L11);
                        }
                        l.g(sk2Var3, (aj2) L11, wc2Var2);
                    } else {
                        sk2Var4.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, 1572864, 58);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, mj5Var, pp5Var, r94Var, ki2Var, mi2Var, mi2Var2, ki2Var2, aj2Var, ki2Var3, mi2Var3, ki2Var4, ki2Var5, ki2Var6, mi2Var4, aj2Var2, i2) { // from class: dl5
                public final /* synthetic */ String B;
                public final /* synthetic */ mj5 L;
                public final /* synthetic */ pp5 R;
                public final /* synthetic */ r94 X;
                public final /* synthetic */ ki2 Y;
                public final /* synthetic */ mi2 Z;
                public final /* synthetic */ mi2 c0;
                public final /* synthetic */ ki2 d0;
                public final /* synthetic */ aj2 e0;
                public final /* synthetic */ ki2 f0;
                public final /* synthetic */ mi2 g0;
                public final /* synthetic */ ki2 h0;
                public final /* synthetic */ ki2 i0;
                public final /* synthetic */ ki2 j0;
                public final /* synthetic */ mi2 k0;
                public final /* synthetic */ aj2 l0;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(385);
                    jv3.g(rg5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, k10] */
    public static void g0(int i2, ky0 ky0Var, gz0 gz0Var) {
        boolean z;
        boolean z2;
        char c2;
        cy0 cy0Var;
        cy0 cy0Var2;
        float f2;
        char c3;
        cy0 cy0Var3;
        cy0 cy0Var4;
        if (!gz0Var.n) {
            if (!(gz0Var instanceof hz0) && gz0Var.A() && m(gz0Var)) {
                hz0.W(gz0Var, ky0Var, new Object());
            }
            cy0 j2 = gz0Var.j(by0.TOP);
            cy0 j3 = gz0Var.j(by0.BOTTOM);
            int d2 = j2.d();
            int d3 = j3.d();
            HashSet hashSet = j2.a;
            char c4 = 1;
            if (hashSet != null && j2.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    cy0 cy0Var5 = (cy0) it.next();
                    gz0 gz0Var2 = cy0Var5.d;
                    int i3 = i2 + 1;
                    boolean m2 = m(gz0Var2);
                    cy0 cy0Var6 = gz0Var2.J;
                    cy0 cy0Var7 = gz0Var2.L;
                    if (gz0Var2.A() && m2) {
                        f2 = RecyclerView.A1;
                        hz0.W(gz0Var2, ky0Var, new Object());
                    } else {
                        f2 = RecyclerView.A1;
                    }
                    if ((cy0Var5 == cy0Var6 && (cy0Var4 = cy0Var7.f) != null && cy0Var4.c) || (cy0Var5 == cy0Var7 && (cy0Var3 = cy0Var6.f) != null && cy0Var3.c)) {
                        c3 = c4;
                    } else {
                        c3 = 0;
                    }
                    fz0 fz0Var = gz0Var2.T[c4];
                    char c5 = c4;
                    fz0 fz0Var2 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var == fz0Var2 && !m2) {
                        if (fz0Var == fz0Var2 && gz0Var2.y >= 0 && gz0Var2.x >= 0 && ((gz0Var2.h0 == 8 || (gz0Var2.s == 0 && gz0Var2.X == f2)) && !gz0Var2.z() && !gz0Var2.F && c3 != 0 && !gz0Var2.z())) {
                            c0(i3, gz0Var, ky0Var, gz0Var2);
                        }
                    } else if (!gz0Var2.A()) {
                        if (cy0Var5 == cy0Var6 && cy0Var7.f == null) {
                            int e2 = cy0Var6.e() + d2;
                            gz0Var2.L(e2, gz0Var2.l() + e2);
                            g0(i3, ky0Var, gz0Var2);
                        } else if (cy0Var5 == cy0Var7 && cy0Var6.f == null) {
                            int e3 = d2 - cy0Var7.e();
                            gz0Var2.L(e3 - gz0Var2.l(), e3);
                            g0(i3, ky0Var, gz0Var2);
                        } else if (c3 != 0 && !gz0Var2.z()) {
                            b0(i3, ky0Var, gz0Var2);
                        }
                    }
                    c4 = c5;
                }
            }
            char c6 = c4;
            if (gz0Var instanceof yo2) {
                return;
            }
            HashSet hashSet2 = j3.a;
            if (hashSet2 != null && j3.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    cy0 cy0Var8 = (cy0) it2.next();
                    gz0 gz0Var3 = cy0Var8.d;
                    int i4 = i2 + 1;
                    boolean m3 = m(gz0Var3);
                    cy0 cy0Var9 = gz0Var3.J;
                    cy0 cy0Var10 = gz0Var3.L;
                    if (gz0Var3.A() && m3) {
                        hz0.W(gz0Var3, ky0Var, new Object());
                    }
                    if ((cy0Var8 == cy0Var9 && (cy0Var2 = cy0Var10.f) != null && cy0Var2.c) || (cy0Var8 == cy0Var10 && (cy0Var = cy0Var9.f) != null && cy0Var.c)) {
                        c2 = c6;
                    } else {
                        c2 = 0;
                    }
                    fz0 fz0Var3 = gz0Var3.T[c6];
                    fz0 fz0Var4 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var3 == fz0Var4 && !m3) {
                        if (fz0Var3 == fz0Var4 && gz0Var3.y >= 0 && gz0Var3.x >= 0 && (gz0Var3.h0 == 8 || (gz0Var3.s == 0 && gz0Var3.X == RecyclerView.A1))) {
                            if (!gz0Var3.z() && !gz0Var3.F && c2 != 0 && !gz0Var3.z()) {
                                c0(i4, gz0Var, ky0Var, gz0Var3);
                            }
                        }
                    } else if (!gz0Var3.A()) {
                        if (cy0Var8 == cy0Var9 && cy0Var10.f == null) {
                            int e4 = cy0Var9.e() + d3;
                            gz0Var3.L(e4, gz0Var3.l() + e4);
                            g0(i4, ky0Var, gz0Var3);
                        } else if (cy0Var8 == cy0Var10 && cy0Var9.f == null) {
                            int e5 = d3 - cy0Var10.e();
                            gz0Var3.L(e5 - gz0Var3.l(), e5);
                            g0(i4, ky0Var, gz0Var3);
                        } else if (c2 != 0 && !gz0Var3.z()) {
                            b0(i4, ky0Var, gz0Var3);
                        }
                    }
                }
            }
            cy0 j4 = gz0Var.j(by0.BASELINE);
            if (j4.a != null && j4.c) {
                int d4 = j4.d();
                Iterator it3 = j4.a.iterator();
                while (it3.hasNext()) {
                    cy0 cy0Var11 = (cy0) it3.next();
                    gz0 gz0Var4 = cy0Var11.d;
                    int i5 = i2 + 1;
                    boolean m4 = m(gz0Var4);
                    cy0 cy0Var12 = gz0Var4.M;
                    if (gz0Var4.A() && m4) {
                        hz0.W(gz0Var4, ky0Var, new Object());
                    }
                    if (gz0Var4.T[c6 == 1 ? 1 : 0] != fz0.MATCH_CONSTRAINT || m4) {
                        if (!gz0Var4.A()) {
                            if (cy0Var11 == cy0Var12) {
                                int e6 = cy0Var11.e() + d4;
                                if (!gz0Var4.E) {
                                    z = c6 == 1 ? 1 : 0;
                                } else {
                                    int i6 = e6 - gz0Var4.b0;
                                    int i7 = gz0Var4.W + i6;
                                    gz0Var4.a0 = i6;
                                    gz0Var4.J.l(i6);
                                    gz0Var4.L.l(i7);
                                    cy0Var12.l(e6);
                                    boolean z3 = c6 == 1 ? 1 : 0;
                                    gz0Var4.l = z3;
                                    z = z3;
                                }
                                g0(i5, ky0Var, gz0Var4);
                                z2 = z;
                                c6 = z2;
                            }
                        }
                    }
                    z2 = c6 == 1 ? 1 : 0;
                    c6 = z2;
                }
            }
            gz0Var.n = c6;
        }
    }

    public static final void h(tu0 tu0Var, int i2) {
        boolean z;
        sk2 sk2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1016375248);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i2 & 1, z)) {
            String upperCase = me2.X(sk2Var2, R.string.retro_achievements_unofficial).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long j2 = jd7.p;
            ml2 ml2Var = td7.c;
            sk2Var = sk2Var2;
            ir6.b(upperCase, b53.Y(b53.z(1.0f, j2, wy3.a, gr5.b(4.0f)), 5.0f, 1.0f), j2, hi2.A(7.5d), pe2.c0, ml2Var, hi2.A(0.5d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355840, 0, 130832);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gu5(i2, 22);
        }
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void i(zy3 zy3Var, n6 n6Var, boolean z, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        aj2 ugVar;
        ti4 ti4Var;
        Boolean bool;
        k24 k24Var;
        int i7;
        long j2;
        URL url;
        long j3;
        wy3 wy3Var;
        wy3 wy3Var2;
        boolean z5;
        mv0 mv0Var;
        zy3Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1705091830);
        if (sk2Var.f(n6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i2 | i3;
        if (sk2Var.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i11 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            dy4 a2 = n6Var.a();
            boolean L = L(n6Var);
            ti4 Q = Q(n6Var);
            Object L2 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L2;
            k24 a3 = bh7.a(l14Var, sk2Var, 6);
            fr5 b2 = gr5.b(13.0f);
            Boolean bool2 = (Boolean) a3.getValue();
            bool2.getClass();
            boolean f2 = sk2Var.f(a3);
            if ((i11 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = f2 | z3;
            if ((i11 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z6;
            Object L3 = sk2Var.L();
            if (!z7 && L3 != sn1Var) {
                ugVar = L3;
                ti4Var = Q;
                bool = bool2;
                k24Var = a3;
                i7 = 0;
            } else {
                ti4Var = Q;
                bool = bool2;
                k24Var = a3;
                i7 = 0;
                ugVar = new ug(mi2Var, n6Var, k24Var, null, 12);
                sk2Var.h0(ugVar);
            }
            l.g(sk2Var, ugVar, bool);
            zy3 t = a53.t(zy3Var, b2);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                j2 = C.e;
            } else {
                j2 = C.d;
            }
            is2 is2Var = iq2.g;
            zy3 i12 = dk7.i(t, j2, is2Var);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                i12 = b53.z(2.0f, C.j, i12, b2);
            }
            zy3 Y = b53.Y(a53.r(i12, l14Var, null, false, null, ki2Var, 28), 13.0f, 11.0f);
            i20 i20Var = y60.g0;
            lt ltVar = rt.a;
            sr5 a4 = rr5.a(ltVar, i20Var, sk2Var, i7);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var2 = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a4);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            if (L) {
                url = a2.j;
            } else {
                url = a2.k;
            }
            String url2 = url.toString();
            url2.getClass();
            a(url2, 42.0f, sk2Var, 48);
            wy3 wy3Var3 = wy3.a;
            cg2.k(sk2Var, o76.k(wy3Var3, 12.0f));
            ur5 ur5Var = ur5.a;
            zy3 a5 = ur5Var.a(wy3Var3, 1.0f, true);
            lr0 a6 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a5);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a6);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            i20 i20Var2 = y60.h0;
            sr5 a7 = rr5.a(ltVar, i20Var2, sk2Var, 48);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, wy3Var3);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a7);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            String a8 = a2.a();
            if (L) {
                j3 = C.g;
            } else {
                j3 = C.h;
            }
            long B = hi2.B(13);
            pe2 pe2Var = pe2.c0;
            ir6.b(a8, ur5Var.a(wy3Var3, 1.0f, false), j3, B, pe2Var, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, 199680, 3120, 120784);
            if (a2.m == cy4.UNOFFICIAL) {
                sk2Var.X(-727011164);
                cg2.k(sk2Var, o76.k(wy3Var3, 8.0f));
                h(sk2Var, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(-726909298);
                sk2Var.p(false);
            }
            if (a2.b()) {
                sk2Var.X(-726850212);
                cg2.k(sk2Var, o76.k(wy3Var3, 6.0f));
                ev2.b(ve2.J(sk2Var, R.drawable.ic_status_warn), me2.X(sk2Var, R.string.achievement_missable), o76.h(wy3Var3, 13.0f), jd7.p, sk2Var, 3464, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(-726463890);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            ir6.b(a2.g, b53.b0(wy3Var3, RecyclerView.A1, 2.0f, RecyclerView.A1, RecyclerView.A1, 13), C.i, hi2.A(11.5d), null, null, 0L, null, hi2.B(16), 2, false, 2, 0, null, null, sk2Var, 3120, 3126, 119792);
            sk2 sk2Var2 = sk2Var;
            if (z) {
                sk2Var2.X(987614771);
                wy3Var = wy3Var3;
                ir6.b(me2.X(sk2Var2, R.string.offline_ra_in_ledger_badge), b53.b0(wy3Var3, RecyclerView.A1, 3.0f, RecyclerView.A1, RecyclerView.A1, 13), C.l, hi2.B(9), pe2Var, td7.c, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var2, 1772592, 0, 130960);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            } else {
                wy3Var = wy3Var3;
                sk2Var2.X(987965970);
                sk2Var2.p(false);
            }
            if (ti4Var != null) {
                Object obj = ti4Var.A;
                Object obj2 = ti4Var.B;
                sk2Var2.X(988057265);
                wy3 wy3Var4 = wy3Var;
                zy3 b0 = b53.b0(wy3Var4, RecyclerView.A1, 7.0f, RecyclerView.A1, RecyclerView.A1, 13);
                sr5 a9 = rr5.a(ltVar, i20Var2, sk2Var2, 48);
                int hashCode4 = Long.hashCode(sk2Var2.T);
                sm4 l5 = sk2Var2.l();
                zy3 e04 = l07.e0(sk2Var2, b0);
                sk2Var2.b0();
                if (sk2Var2.S) {
                    mv0Var = mv0Var2;
                    sk2Var2.k(mv0Var);
                } else {
                    mv0Var = mv0Var2;
                    sk2Var2.k0();
                }
                oo2.S(sk2Var2, dnVar, a9);
                oo2.S(sk2Var2, dnVar2, l5);
                b31.x(hashCode4, sk2Var2, dnVar3, sk2Var2, ydVar);
                oo2.S(sk2Var2, dnVar4, e04);
                zy3 i13 = dk7.i(a53.t(o76.d(ur5Var.a(wy3Var4, 1.0f, true), 4.0f), gr5.b(2.0f)), C.e, is2Var);
                tv3 d2 = d50.d(y60.L, false);
                int hashCode5 = Long.hashCode(sk2Var2.T);
                sm4 l6 = sk2Var2.l();
                zy3 e05 = l07.e0(sk2Var2, i13);
                sk2Var2.b0();
                if (sk2Var2.S) {
                    sk2Var2.k(mv0Var);
                } else {
                    sk2Var2.k0();
                }
                oo2.S(sk2Var2, dnVar, d2);
                oo2.S(sk2Var2, dnVar2, l6);
                b31.x(hashCode5, sk2Var2, dnVar3, sk2Var2, ydVar);
                oo2.S(sk2Var2, dnVar4, e05);
                Number number = (Number) obj2;
                int intValue = number.intValue();
                float f3 = RecyclerView.A1;
                if (intValue != 0) {
                    f3 = io2.l(((Number) obj).intValue() / number.floatValue(), RecyclerView.A1, 1.0f);
                }
                d50.a(dk7.i(a53.t(o76.d(o76.c(wy3Var4, f3), 4.0f), gr5.b(2.0f)), C.l, is2Var), sk2Var2, 0);
                sk2Var2.p(true);
                cg2.k(sk2Var2, o76.k(wy3Var4, 9.0f));
                sk2 sk2Var3 = sk2Var2;
                wy3Var2 = wy3Var4;
                ir6.b(me2.W(R.string.achievement_progress, new Object[]{obj, obj2}, sk2Var2), null, C.i, hi2.B(9), null, td7.c, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var3, 1575936, 0, 130994);
                sk2Var2 = sk2Var3;
                z5 = true;
                sk2Var2.p(true);
                sk2Var2.p(false);
            } else {
                wy3Var2 = wy3Var;
                z5 = true;
                sk2Var2.X(989271442);
                sk2Var2.p(false);
            }
            sk2Var2.p(z5);
            cg2.k(sk2Var2, o76.k(wy3Var2, 10.0f));
            sk2 sk2Var4 = sk2Var2;
            ir6.b(String.valueOf(a2.h), null, jd7.p, hi2.A(10.5d), pe2Var, td7.c, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var4, 1772928, 0, 130962);
            sk2Var = sk2Var4;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gi(zy3Var, n6Var, z, ki2Var, mi2Var, i2);
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        h0(byteArrayOutputStream, i2, 2);
    }

    public static final void j(ec6 ec6Var) {
        int i2 = ec6Var.R;
        int[] iArr = ec6Var.B;
        Object[] objArr = ec6Var.L;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != j) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        ec6Var.A = false;
        ec6Var.R = i3;
    }

    public static final Object k(vc1 vc1Var, ki2 ki2Var, k11 k11Var) {
        k50 k50Var;
        m74 O;
        Object l0;
        zc0 zc0Var;
        if (((yy3) vc1Var).A.i0) {
            yy3 yy3Var = (yy3) vc1Var;
            if (!yy3Var.A.i0) {
                mz2.c("visitAncestors called on an unattached node");
            }
            yy3 yy3Var2 = yy3Var.A.X;
            vf3 P = l.P(vc1Var);
            loop0: while (true) {
                k50Var = null;
                if (P == null) {
                    break;
                }
                if ((((yy3) P.A0.g).R & 524288) != 0) {
                    while (yy3Var2 != null) {
                        if ((yy3Var2.L & 524288) != 0) {
                            yy3 yy3Var3 = yy3Var2;
                            o24 o24Var = null;
                            while (yy3Var3 != null) {
                                if (yy3Var3 instanceof k50) {
                                    k50Var = yy3Var3;
                                    break loop0;
                                }
                                if ((yy3Var3.L & 524288) != 0 && (yy3Var3 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                        if ((yy3Var4.L & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var3 = yy3Var4;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var3 != null) {
                                                    o24Var.b(yy3Var3);
                                                    yy3Var3 = null;
                                                }
                                                o24Var.b(yy3Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var3 = l.p(o24Var);
                            }
                            continue;
                        }
                        yy3Var2 = yy3Var2.X;
                    }
                }
                P = P.u();
                if (P != null && (zc0Var = P.A0) != null) {
                    yy3Var2 = (lm6) zc0Var.f;
                } else {
                    yy3Var2 = null;
                }
            }
            k50 k50Var2 = k50Var;
            if (k50Var2 != null && (l0 = k50Var2.l0((O = l.O(vc1Var)), new wd(2, ki2Var, O), k11Var)) == p31.COROUTINE_SUSPENDED) {
                return l0;
            }
        }
        return o27.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:27:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List l(defpackage.z86 r5, java.lang.Integer r6, int r7, java.lang.Integer r8) {
        /*
            boolean r0 = r5.w
            if (r0 != 0) goto L9d
            int r0 = r5.p()
            if (r0 == 0) goto L9d
            n45 r0 = new n45
            r0.<init>(r5)
            if (r8 == 0) goto L16
            int r8 = r8.intValue()
            goto L20
        L16:
            int r8 = r5.v
            if (r8 >= 0) goto L20
            int[] r8 = r5.b
            int r8 = r5.E(r8, r7)
        L20:
            if (r6 != 0) goto L44
            int r6 = r5.i
            int[] r1 = r5.b
            int r2 = r5.r(r7)
            int r1 = r5.N(r1, r2)
            int r6 = r6 - r1
            j14 r1 = r5.s
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.b(r7)
            w14 r1 = (defpackage.w14) r1
            if (r1 == 0) goto L3e
            int r1 = r1.b
            goto L3f
        L3e:
            r1 = 0
        L3f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L44:
            int r1 = r5.r(r7)
            int r1 = r1 * 5
            int[] r2 = r5.b
            int r3 = r2.length
            if (r1 >= r3) goto L54
            int r1 = r5.s(r7)
            goto L61
        L54:
            if (r8 < 0) goto L5b
            int r7 = r5.E(r2, r8)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            int r1 = r5.s(r8)
            goto L92
        L61:
            if (r7 < 0) goto L98
            int r2 = r5.r(r7)
            int[] r3 = r5.b
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            java.lang.Object r2 = r5.t(r7)
            goto L7b
        L79:
            sn1 r2 = defpackage.su0.a
        L7b:
            uk2 r3 = r5.O(r7)
            r0.i(r1, r2, r3, r6)
            mk2 r6 = r5.b(r7)
            if (r8 < 0) goto L96
            int[] r7 = r5.b
            int r7 = r5.E(r7, r8)
            int r1 = r5.s(r8)
        L92:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L61
        L96:
            r7 = r8
            goto L61
        L98:
            java.lang.Object r5 = r0.a
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L9d:
            pp1 r5 = defpackage.pp1.A
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.l(z86, java.lang.Integer, int, java.lang.Integer):java.util.List");
    }

    public static boolean m(gz0 gz0Var) {
        hz0 hz0Var;
        boolean z;
        boolean z2;
        fz0 fz0Var;
        fz0 fz0Var2;
        fz0[] fz0VarArr = gz0Var.T;
        fz0 fz0Var3 = fz0VarArr[0];
        fz0 fz0Var4 = fz0VarArr[1];
        gz0 gz0Var2 = gz0Var.U;
        if (gz0Var2 != null) {
            hz0Var = (hz0) gz0Var2;
        } else {
            hz0Var = null;
        }
        if (hz0Var != null) {
            fz0 fz0Var5 = hz0Var.T[0];
            fz0 fz0Var6 = fz0.FIXED;
        }
        if (hz0Var != null) {
            fz0 fz0Var7 = hz0Var.T[1];
            fz0 fz0Var8 = fz0.FIXED;
        }
        fz0 fz0Var9 = fz0.FIXED;
        if (fz0Var3 != fz0Var9 && !gz0Var.B() && fz0Var3 != fz0.WRAP_CONTENT && ((fz0Var3 != (fz0Var2 = fz0.MATCH_CONSTRAINT) || gz0Var.r != 0 || gz0Var.X != RecyclerView.A1 || !gz0Var.u(0)) && (fz0Var3 != fz0Var2 || gz0Var.r != 1 || !gz0Var.v(0, gz0Var.r())))) {
            z = false;
        } else {
            z = true;
        }
        if (fz0Var4 != fz0Var9 && !gz0Var.C() && fz0Var4 != fz0.WRAP_CONTENT && ((fz0Var4 != (fz0Var = fz0.MATCH_CONSTRAINT) || gz0Var.s != 0 || gz0Var.X != RecyclerView.A1 || !gz0Var.u(1)) && (fz0Var4 != fz0Var || gz0Var.s != 1 || !gz0Var.v(1, gz0Var.l())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((gz0Var.X <= RecyclerView.A1 || (!z && !z2)) && (!z || !z2)) {
            return false;
        }
        return true;
    }

    public static final byte n(char c2) {
        if (c2 < '~') {
            return dk0.b[c2];
        }
        return (byte) 0;
    }

    public static int o(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new k84(context).b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        c44.i("permission must be non-null");
        return 0;
    }

    public static byte[] p(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final double q(int i2, int i3, int i4, int i5, uu5 uu5Var) {
        double d2 = i4 / i2;
        double d3 = i5 / i3;
        int i6 = a91.a[uu5Var.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return Math.min(d2, d3);
            }
            i.c();
            return 0.0d;
        }
        return Math.max(d2, d3);
    }

    public static final oo r(oo ooVar) {
        oo c2 = ooVar.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(i2, ooVar.a(i2));
        }
        return c2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [sb0, java.lang.Object] */
    public static sb0 s(sb0... sb0VarArr) {
        List asList = Arrays.asList(sb0VarArr);
        if (asList.isEmpty()) {
            return new Object();
        }
        if (asList.size() == 1) {
            return (sb0) asList.get(0);
        }
        return new tb0(asList);
    }

    public static void t(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!m) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    k = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    l = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    k = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    l = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = k;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = l;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            m = true;
        }
        if (z) {
            try {
                Method method4 = k;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = l) != null) {
            method.invoke(canvas, null);
        }
    }

    public static final Integer u(v86 v86Var, dv0 dv0Var, int i2, int i3) {
        Integer u;
        wk2 wk2Var;
        Object obj;
        int[] iArr = v86Var.b;
        while (true) {
            pk2 pk2Var = null;
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (v86Var.j(i2) && v86Var.i(i2) == 206 && b53.x(v86Var.p(iArr, i2), xu0.e)) {
                Object h2 = v86Var.h(i2, 0);
                if (h2 instanceof wk2) {
                    wk2Var = (wk2) h2;
                } else {
                    wk2Var = null;
                }
                if (wk2Var != null) {
                    obj = wk2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof pk2) {
                    pk2Var = (pk2) obj;
                }
                if (pk2Var != null && pk2Var.A == dv0Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (v86Var.d(i2) && (u = u(v86Var, dv0Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(u.intValue());
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [u41, jv3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [jv3, java.lang.Object, xn3] */
    public static jv3 v(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        if (i2 != 0) {
            if (i2 != 2) {
                ?? obj = new Object();
                int length = dArr2[0].length;
                obj.r = new double[length];
                obj.p = dArr;
                obj.q = dArr2;
                if (length > 2) {
                    double d2 = 0.0d;
                    int i3 = 0;
                    while (true) {
                        double d3 = d2;
                        if (i3 >= dArr.length) {
                            break;
                        }
                        double d4 = dArr2[i3][0];
                        if (i3 > 0) {
                            Math.hypot(d4 - d2, d4 - d3);
                        }
                        i3++;
                        d2 = d4;
                    }
                }
                return obj;
            }
            double d5 = dArr[0];
            double[] dArr3 = dArr2[0];
            ?? obj2 = new Object();
            obj2.p = d5;
            obj2.q = dArr3;
            return obj2;
        }
        return new fz3(dArr, dArr2);
    }

    public static final int w(int i2, pe2 pe2Var) {
        boolean z;
        boolean z2;
        if (pe2Var.compareTo(pe2.R) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList x(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            zb5 r1 = new zb5
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.ac5.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.ac5.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            yb5 r5 = (defpackage.yb5) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.ac5.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.er0.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.ac5.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.ac5.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            yb5 r0 = new yb5     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.x(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Display y(xp xpVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o2.d(xpVar);
        }
        return ((WindowManager) xpVar.getSystemService("window")).getDefaultDisplay();
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return en1.b(edgeEffect);
        }
        return RecyclerView.A1;
    }

    public abstract double C(double d2);

    public abstract void D(double d2, double[] dArr);

    public abstract void E(double d2, float[] fArr);

    public abstract void G(double d2, double[] dArr);

    public abstract double[] H();
}
