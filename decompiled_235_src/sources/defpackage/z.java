package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z  reason: default package */
/* loaded from: classes.dex */
public final class z extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r41 r41Var, qn2 qn2Var, m16 m16Var) {
        super(2, r41Var);
        this.X = 28;
        this.Z = m16Var;
        this.d0 = qn2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (defpackage.yh2.n(r12, r11) == r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (defpackage.q60.t(500, r11) == r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0072 -> B:36:0x0075). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        c81 c81Var = (c81) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                oi2.Y(obj);
                                c81Var.c.i(1.0f);
                                this.Y = 3;
                                if (q60.t(500L, this) == x61Var) {
                                    return x61Var;
                                }
                                c81Var.c.i(RecyclerView.B1);
                                this.Y = 4;
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj);
                            c81Var.c.i(RecyclerView.B1);
                            this.Y = 4;
                        }
                    } else {
                        oi2.Y(obj);
                        throw new RuntimeException();
                    }
                } else {
                    oi2.Y(obj);
                }
            } else {
                oi2.Y(obj);
                rc3 rc3Var = (rc3) this.Z;
                if (rc3Var != null) {
                    this.Y = 1;
                }
            }
            c81Var.c.i(1.0f);
            if (!c81Var.a) {
                this.Y = 2;
                if (q60.j(this) == x61Var) {
                    return x61Var;
                }
                throw new RuntimeException();
            }
            this.Y = 3;
            if (q60.t(500L, this) == x61Var) {
            }
            c81Var.c.i(RecyclerView.B1);
            this.Y = 4;
        } catch (Throwable th) {
            c81Var.c.i(RecyclerView.B1);
            throw th;
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((z) q((r41) obj2, (v63) obj)).s(jg7Var);
            case 5:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((z) q((r41) obj2, (Uri) obj)).s(jg7Var);
            case 7:
                return ((z) q((r41) obj2, (z23) obj)).s(jg7Var);
            case 8:
                return ((z) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 9:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((z) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 11:
                return ((z) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 12:
                return ((z) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 13:
                return ((z) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 14:
                return ((z) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 15:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 18:
                return ((z) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 19:
                return ((z) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 20:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 22:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 25:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((z) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((z) q((r41) obj2, (pq5) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new z((r94) this.Z, (oy2) obj2, r41Var, 0);
            case 1:
                return new z((r94) this.Z, (py2) obj2, r41Var, 1);
            case 2:
                return new z((le2) this.Z, (w6) obj2, r41Var, 2);
            case 3:
                return new z((ki) this.Z, (u63) obj2, r41Var, 3);
            case 4:
                z zVar = new z((rj) obj2, r41Var, 4);
                zVar.Z = obj;
                return zVar;
            case 5:
                z zVar2 = new z((c05) obj2, r41Var, 5);
                zVar2.Z = obj;
                return zVar2;
            case 6:
                z zVar3 = new z((ft) obj2, r41Var, 6);
                zVar3.Z = obj;
                return zVar3;
            case 7:
                z zVar4 = new z((lw) obj2, r41Var, 7);
                zVar4.Z = obj;
                return zVar4;
            case 8:
                z zVar5 = new z((c20) obj2, r41Var, 8);
                zVar5.Z = obj;
                return zVar5;
            case 9:
                return new z((w70) this.Z, (u6) obj2, r41Var, 9);
            case 10:
                z zVar6 = new z((eb) obj2, r41Var, 10);
                zVar6.Z = obj;
                return zVar6;
            case 11:
                z zVar7 = new z((sc0) obj2, r41Var, 11);
                zVar7.Z = obj;
                return zVar7;
            case 12:
                z zVar8 = new z((ed0) obj2, r41Var, 12);
                zVar8.Z = obj;
                return zVar8;
            case 13:
                z zVar9 = new z((wl0) obj2, r41Var, 13);
                zVar9.Z = obj;
                return zVar9;
            case 14:
                z zVar10 = new z((xl0) obj2, r41Var, 14);
                zVar10.Z = obj;
                return zVar10;
            case 15:
                return new z((le2) this.Z, (pb6) obj2, r41Var, 15);
            case 16:
                return new z((CheatImportWorker) this.Z, (String) obj2, r41Var, 16);
            case 17:
                return new z((CheatImportWorker) this.Z, (cp2) obj2, r41Var, 17);
            case 18:
                z zVar11 = new z((aq0) obj2, r41Var, 18);
                zVar11.Z = obj;
                return zVar11;
            case 19:
                z zVar12 = new z((ArrayList) obj2, r41Var, 19);
                zVar12.Z = obj;
                return zVar12;
            case 20:
                return new z((aq0) this.Z, (jh1) obj2, r41Var, 20);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new z((aq0) this.Z, (Cheat) obj2, r41Var, 21);
            case 22:
                return new z((ax0) obj2, r41Var, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                return new z((dx0) this.Z, (Runnable) obj2, r41Var, 23);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new z((eo2) this.Z, (rz4) obj2, r41Var, 24);
            case 25:
                return new z((eo2) this.Z, (dh5) obj2, r41Var, 25);
            case SubAllocator.N4 /* 26 */:
                return new z((zy4) this.Z, (p27) obj2, r41Var, 26);
            case 27:
                return new z((rc3) this.Z, (c81) obj2, r41Var, 27);
            case 28:
                return new z(r41Var, (qn2) obj2, (m16) this.Z);
            default:
                z zVar13 = new z((xa1) obj2, r41Var, 29);
                zVar13.Z = obj;
                return zVar13;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:399|400|401|(3:404|(9:407|408|409|410|411|412|413|414|415)(1:406)|402)|419|409|410|411|412|413|414|415) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025b, code lost:
        if (r1.a(r3, r25) == r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026e, code lost:
        if (r3 == r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0280, code lost:
        if (r1.a(r5, r25) == r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e6, code lost:
        if (((defpackage.h16) r2).g(r1, r25) == r3) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x05f7, code lost:
        if (r0 == r2) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x094d, code lost:
        if (defpackage.ii2.x(r4).a(new defpackage.ns2(1, r2), r25) == r1) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x096d, code lost:
        if (defpackage.of6.m((defpackage.of6) r2, r3, r25) == r1) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:?, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:403:0x088d -> B:405:0x0891). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        w61 w61Var;
        jg7 jg7Var;
        jg7 jg7Var2;
        Object d0;
        y56 y56Var;
        Object obj2;
        ArrayList arrayList;
        Serializable serializable;
        zg5 zg5Var;
        sr4 sr4Var = null;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((r94) this.Z).a((oy2) this.d0, this) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((r94) this.Z).a((py2) this.d0, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    y6 y6Var = new y6((w6) this.d0, 0);
                    this.Y = 1;
                    if (((le2) this.Z).b(y6Var, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        e41.c();
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    v83 v83Var = new v83(23);
                    this.Y = 1;
                    l61 l61Var = this.B;
                    l61Var.getClass();
                    break;
                }
                na4 i5 = ((ki) this.Z).i();
                if (i5 != null) {
                    y6 y6Var2 = new y6((u63) this.d0, 1);
                    this.Y = 2;
                    break;
                } else {
                    return jg7.a;
                }
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v63 v63Var = (v63) this.Z;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    v63 v63Var2 = (v63) this.Z;
                    rj rjVar = (rj) this.d0;
                    this.Z = v63Var2;
                    this.Y = 1;
                    rj0 rj0Var = new rj0(1, np2.V(this));
                    rj0Var.v();
                    o37 o37Var = rjVar.B;
                    gy4 gy4Var = o37Var.a;
                    gy4Var.a();
                    o37Var.b.set(new t37(o37Var, gy4Var));
                    rj0Var.z(new qj(1, v63Var2, rjVar));
                    if (rj0Var.s() == x61Var5) {
                        return x61Var5;
                    }
                }
                e41.c();
                return null;
            case 5:
                l61 l61Var2 = this.B;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        w61Var = (w61) this.Z;
                        oi2.Y(obj);
                        c05 c05Var = (c05) this.d0;
                        int[] iArr = c05Var.B0;
                        if (c05Var.isAttachedToWindow()) {
                            int i8 = iArr[0];
                            int i9 = iArr[1];
                            c05Var.l0.getLocationOnScreen(iArr);
                            if (i8 != iArr[0] || i9 != iArr[1]) {
                                c05Var.o();
                            }
                        }
                        if (g04.H(w61Var)) {
                            ne neVar = ne.d0;
                            this.Z = w61Var;
                            this.Y = 1;
                            l61Var2.getClass();
                            if (l61Var2.Z(d90.u0) == null) {
                                l61Var2.getClass();
                                if (ii2.x(l61Var2).a(neVar, this) == x61Var6) {
                                    return x61Var6;
                                }
                                c05 c05Var2 = (c05) this.d0;
                                int[] iArr2 = c05Var2.B0;
                                if (c05Var2.isAttachedToWindow()) {
                                }
                                if (g04.H(w61Var)) {
                                    return jg7.a;
                                }
                            } else {
                                u34.a();
                                return null;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61Var = (w61) this.Z;
                    if (g04.H(w61Var)) {
                    }
                }
                break;
            case 6:
                jg7 jg7Var3 = jg7.a;
                Uri uri = (Uri) this.Z;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (uri != null) {
                        this.Z = null;
                        this.Y = 1;
                        Context context = ((ft) this.d0).a;
                        qi6 h = zl1.h(context, uri);
                        Context context2 = h.b;
                        Uri uri2 = h.c;
                        if (context2.checkCallingOrSelfUriPermission(uri2, 2) != 0) {
                            jg7Var = jg7Var3;
                        } else {
                            String U = hv.U(context2, uri2, "mime_type");
                            jg7Var = jg7Var3;
                            int T = (int) hv.T(context2, uri2, "flags", 0L);
                            if (!TextUtils.isEmpty(U) && ((T & 4) != 0 || (("vnd.android.document/directory".equals(U) && (T & 8) != 0) || (!TextUtils.isEmpty(U) && (T & 2) != 0)))) {
                                zl1 f = h.f("melonDualLog.log");
                                if (f == null) {
                                    f = h.c("text/plain", "melonDualLog.log");
                                }
                                if (f == null) {
                                    Log.w("AppLogFileRecorder", "Could not create app log file in ROM directory: " + uri);
                                } else {
                                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(f.j(), "wa");
                                    if (openOutputStream != null) {
                                        try {
                                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(openOutputStream));
                                            bufferedWriter.append('\n');
                                            bufferedWriter.append((CharSequence) "melonDualDS app log").append('\n');
                                            String format = ft.d.format(new Date());
                                            bufferedWriter.append((CharSequence) ("started=" + format)).append('\n');
                                            int myPid = Process.myPid();
                                            bufferedWriter.append((CharSequence) ("pid=" + myPid)).append('\n');
                                            bufferedWriter.append((CharSequence) ("directory=" + uri)).append('\n');
                                            bufferedWriter.append('\n');
                                            bufferedWriter.flush();
                                            int myPid2 = Process.myPid();
                                            Process start = new ProcessBuilder("logcat", "-v", "threadtime", "--pid=" + myPid2, "-T", "1").redirectErrorStream(true).start();
                                            l61 l61Var3 = this.B;
                                            l61Var3.getClass();
                                            il1 a0 = yh2.u(l61Var3).a0(new k0(start, 11));
                                            try {
                                                InputStream inputStream = start.getInputStream();
                                                inputStream.getClass();
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, qm0.a), 8192);
                                                Iterator it = new f11(new ev(bufferedReader, 2)).iterator();
                                                while (it.hasNext()) {
                                                    String str = (String) it.next();
                                                    if (yh2.z(l61Var3)) {
                                                        bufferedWriter.append((CharSequence) str).append('\n');
                                                        bufferedWriter.flush();
                                                    } else {
                                                        bufferedReader.close();
                                                        bufferedWriter.close();
                                                        openOutputStream.close();
                                                    }
                                                }
                                                bufferedReader.close();
                                                bufferedWriter.close();
                                                openOutputStream.close();
                                            } finally {
                                                start.destroy();
                                                try {
                                                    new Integer(start.waitFor());
                                                } catch (Throwable unused) {
                                                }
                                                a0.dispose();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                ge7.t(openOutputStream, th);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        Uri j = f.j();
                                        vy7.P(Log.w("AppLogFileRecorder", "Could not open app log file for writing: " + j));
                                    }
                                }
                                jg7Var2 = jg7Var;
                                if (jg7Var2 == x61Var7) {
                                    return x61Var7;
                                }
                                return jg7Var2;
                            }
                        }
                        Log.w("AppLogFileRecorder", "App log file requested but ROM directory is not writable: " + uri);
                        jg7Var2 = jg7Var;
                        if (jg7Var2 == x61Var7) {
                        }
                        return jg7Var2;
                    }
                }
                jg7Var2 = jg7Var3;
                return jg7Var2;
            case 7:
                lw lwVar = (lw) this.d0;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        lwVar = (lw) this.Z;
                        oi2.Y(obj);
                        d0 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    z23 z23Var = (z23) this.Z;
                    pe5 pe5Var = (pe5) lwVar.o0.getValue();
                    x23 a = z23.a(z23Var);
                    a.d = new jw(lwVar);
                    a.t = null;
                    a.u = null;
                    a.v = null;
                    rg1 rg1Var = z23Var.A;
                    if (rg1Var.a == null) {
                        a.r = new jw(lwVar);
                        a.t = null;
                        a.u = null;
                        a.v = null;
                    }
                    if (rg1Var.b == null) {
                        z31 z31Var = lwVar.j0;
                        ve5 ve5Var = dk7.b;
                        if (!nb3.k(z31Var, y31.b) && !nb3.k(z31Var, y31.d)) {
                            y56Var = y56.FILL;
                        } else {
                            y56Var = y56.FIT;
                        }
                        a.s = y56Var;
                    }
                    if (rg1Var.d != n05.EXACT) {
                        a.g = n05.INEXACT;
                    }
                    z23 a2 = a.a();
                    this.Z = lwVar;
                    this.Y = 1;
                    pe5Var.getClass();
                    xe1 xe1Var = xk1.a;
                    d0 = hv.d0(e04.a.Y, new ne5(pe5Var, a2, null, 1), this);
                    break;
                }
                a33 a33Var = (a33) d0;
                lwVar.getClass();
                if (a33Var instanceof bu6) {
                    bu6 bu6Var = (bu6) a33Var;
                    return new gw(lwVar.j(bu6Var.a), bu6Var);
                } else if (a33Var instanceof b62) {
                    b62 b62Var = (b62) a33Var;
                    Drawable drawable = b62Var.a;
                    if (drawable != null) {
                        sr4Var = lwVar.j(drawable);
                    }
                    obj3 = new ew(sr4Var, b62Var);
                    return obj3;
                } else {
                    i.d();
                    return null;
                }
            case 8:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    r35 r35Var = (r35) this.Z;
                    c20 c20Var = (c20) this.d0;
                    b20 b20Var = new b20(c20Var, r35Var);
                    a21 a21Var = c20Var.a;
                    a21Var.getClass();
                    synchronized (a21Var.d) {
                        try {
                            if (((LinkedHashSet) a21Var.f).add(b20Var)) {
                                if (((LinkedHashSet) a21Var.f).size() == 1) {
                                    a21Var.e = a21Var.d();
                                    ga0 f2 = ga0.f();
                                    String str2 = b21.a;
                                    f2.b(str2, a21Var.getClass().getSimpleName() + ": initial state = " + a21Var.e);
                                    a21Var.g();
                                }
                                if (c20Var.e(a21Var.e)) {
                                    obj2 = new w21(c20Var.d());
                                } else {
                                    obj2 = v21.a;
                                }
                                r35Var.getClass();
                                r35Var.c(obj2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    q6 q6Var = new q6(10, (c20) this.d0, b20Var);
                    this.Y = 1;
                    if (kj2.q(r35Var, q6Var, this) == x61Var8) {
                        return x61Var8;
                    }
                }
                return jg7.a;
            case 9:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (l.j((w70) this.Z, (u6) this.d0, this) == x61Var9) {
                        return x61Var9;
                    }
                }
                return jg7.a;
            case 10:
                eb ebVar = (eb) this.d0;
                t57 t57Var = (t57) ebVar.L;
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    r35 r35Var2 = (r35) this.Z;
                    yb0 yb0Var = new yb0(r35Var2);
                    CameraManager cameraManager = (CameraManager) ((n55) ebVar.B).get();
                    if (Build.VERSION.SDK_INT >= 28) {
                        cameraManager.getClass();
                        Executor executor = (Executor) t57Var.j.getValue();
                        executor.getClass();
                        cameraManager.registerAvailabilityCallback(executor, yb0Var);
                    } else {
                        cameraManager.registerAvailabilityCallback(yb0Var, t57Var.a());
                    }
                    q6 q6Var2 = new q6(13, cameraManager, yb0Var);
                    this.Y = 1;
                    if (kj2.q(r35Var2, q6Var2, this) == x61Var10) {
                        return x61Var10;
                    }
                }
                return jg7.a;
            case 11:
                sc0 sc0Var = (sc0) this.d0;
                t57 t57Var2 = sc0Var.A;
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    r35 r35Var3 = (r35) this.Z;
                    rc0 rc0Var = new rc0(r35Var3, sc0Var);
                    int i16 = Build.VERSION.SDK_INT;
                    CameraManager cameraManager2 = sc0Var.L;
                    if (i16 >= 28) {
                        cameraManager2.getClass();
                        cameraManager2.registerAvailabilityCallback(t57Var2.g, rc0Var);
                    } else {
                        cameraManager2.registerAvailabilityCallback(rc0Var, t57Var2.a());
                    }
                    q6 q6Var3 = new q6(14, sc0Var, rc0Var);
                    this.Y = 1;
                    if (kj2.q(r35Var3, q6Var3, this) == x61Var11) {
                        return x61Var11;
                    }
                }
                return jg7.a;
            case 12:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    r35 r35Var4 = (r35) this.Z;
                    rc0 rc0Var2 = new rc0((ed0) this.d0, r35Var4);
                    CameraManager cameraManager3 = (CameraManager) ((ed0) this.d0).a.get();
                    cameraManager3.registerAvailabilityCallback(rc0Var2, ((ed0) this.d0).b.a());
                    ed0 ed0Var = (ed0) this.d0;
                    synchronized (ed0Var.f) {
                        arrayList = ed0Var.g;
                    }
                    ed0 ed0Var2 = (ed0) this.d0;
                    if (arrayList != null) {
                        ed0.e(r35Var4, arrayList);
                    } else {
                        ArrayList d = ed0Var2.d();
                        if (d != null) {
                            ed0.e(r35Var4, d);
                        }
                    }
                    q6 q6Var4 = new q6(15, cameraManager3, rc0Var2);
                    this.Y = 1;
                    if (kj2.q(r35Var4, q6Var4, this) == x61Var12) {
                        return x61Var12;
                    }
                }
                return jg7.a;
            case 13:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wl0 wl0Var = (wl0) this.d0;
                    this.Y = 1;
                    if (wl0Var.e((r35) this.Z, this) == x61Var13) {
                        return x61Var13;
                    }
                }
                return jg7.a;
            case 14:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xl0 xl0Var = (xl0) this.d0;
                    this.Y = 1;
                    if (xl0Var.j((ne2) this.Z, this) == x61Var14) {
                        return x61Var14;
                    }
                }
                return jg7.a;
            case 15:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((le2) this.Z).b((pb6) this.d0, this) == x61Var15) {
                        return x61Var15;
                    }
                }
                return jg7.a;
            case 16:
                String str3 = (String) this.d0;
                hp0 hp0Var = ((CheatImportWorker) this.Z).g;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i21 = this.Y;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                Object b = ((h16) hp0Var).b(str3, this);
                if (b != x61Var16) {
                    return b;
                }
                return x61Var16;
            case 17:
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                int i22 = this.Y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hp0 hp0Var2 = ((CheatImportWorker) this.Z).g;
                    this.Y = 1;
                    if (((h16) hp0Var2).e((cp2) this.d0, this) == x61Var17) {
                        return x61Var17;
                    }
                }
                return jg7.a;
            case 18:
                ne2 ne2Var = (ne2) this.Z;
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            if (i23 == 3) {
                                oi2.Y(obj);
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        serializable = obj;
                        qp0 qp0Var = new qp0((List) serializable);
                        this.Z = null;
                        this.Y = 3;
                        break;
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    Object obj4 = new Object();
                    this.Z = ne2Var;
                    this.Y = 1;
                    break;
                }
                hp0 hp0Var3 = ((aq0) this.d0).b;
                this.Z = ne2Var;
                this.Y = 2;
                Serializable j2 = ((h16) hp0Var3).j(this);
                serializable = j2;
                break;
            case 19:
                ne2 ne2Var2 = (ne2) this.Z;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                int i24 = this.Y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qp0 qp0Var2 = new qp0(gt0.k1((ArrayList) this.d0));
                    this.Z = null;
                    this.Y = 1;
                    if (ne2Var2.a(qp0Var2, this) == x61Var19) {
                        return x61Var19;
                    }
                }
                return jg7.a;
            case 20:
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                if (i25 != 0) {
                    if (i25 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hp0 hp0Var4 = ((aq0) this.Z).b;
                    jh1 jh1Var = (jh1) this.d0;
                    an0 an0Var = jh1Var.b;
                    Cheat cheat = jh1Var.a;
                    this.Y = 1;
                    if (((h16) hp0Var4).a(an0Var, cheat, this) == x61Var20) {
                        return x61Var20;
                    }
                }
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                int i26 = this.Y;
                if (i26 != 0) {
                    if (i26 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hp0 hp0Var5 = ((aq0) this.Z).b;
                    this.Y = 1;
                    if (((h16) hp0Var5).m((Cheat) this.d0, this) == x61Var21) {
                        return x61Var21;
                    }
                }
                return jg7.a;
            case 22:
                ax0 ax0Var = (ax0) this.d0;
                x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                int i27 = this.Y;
                if (i27 != 0) {
                    if (i27 == 1) {
                        oi2.Y(obj);
                        zg5Var = (zg5) this.Z;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (ax0Var.k()) {
                        Object obj5 = new Object();
                        eo2 eo2Var = ax0Var.d;
                        v80 v80Var = ax0Var.e;
                        v80Var.getClass();
                        af2 af2Var = new af2(new vl0(v80Var, true), new zw0(obj5, null, 0));
                        this.Z = obj5;
                        this.Y = 1;
                        if (eo2Var.o(af2Var, this) == x61Var22) {
                            return x61Var22;
                        }
                        zg5Var = obj5;
                    }
                    return jg7.a;
                }
                if (!zg5Var.A) {
                    i.m("You must collect the progress flow");
                    return null;
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                jg7 jg7Var4 = jg7.a;
                dx0 dx0Var = (dx0) this.Z;
                x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                int i28 = this.Y;
                if (i28 != 0) {
                    if (i28 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    fy2 fy2Var = dx0Var.f;
                    this.Y = 1;
                    Object b2 = fy2Var.b(RecyclerView.B1 - fy2Var.b, this);
                    if (b2 != x61Var23) {
                        b2 = jg7Var4;
                    }
                    if (b2 == x61Var23) {
                        return x61Var23;
                    }
                }
                ((vs4) dx0Var.c.A).setValue(Boolean.FALSE);
                ((Runnable) this.d0).run();
                return jg7Var4;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                int i29 = this.Y;
                if (i29 != 0) {
                    if (i29 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object o = ((eo2) this.Z).o((rz4) this.d0, this);
                if (o == x61Var24) {
                    return x61Var24;
                }
                return o;
            case 25:
                x61 x61Var25 = x61.COROUTINE_SUSPENDED;
                int i30 = this.Y;
                if (i30 != 0) {
                    if (i30 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                Object obj6 = ((dh5) this.d0).A;
                this.Y = 1;
                Object o2 = ((eo2) this.Z).o(obj6, this);
                if (o2 == x61Var25) {
                    return x61Var25;
                }
                return o2;
            case SubAllocator.N4 /* 26 */:
                x61 x61Var26 = x61.COROUTINE_SUSPENDED;
                int i31 = this.Y;
                if (i31 != 0) {
                    if (i31 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    s51 s51Var = new s51((p27) this.d0, 1);
                    this.Y = 1;
                    if (hz6.d((zy4) this.Z, null, s51Var, this, 7) == x61Var26) {
                        return x61Var26;
                    }
                }
                return jg7.a;
            case 27:
                return v(obj);
            case 28:
                x61 x61Var27 = x61.COROUTINE_SUSPENDED;
                int i32 = this.Y;
                if (i32 != 0) {
                    if (i32 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                m16 m16Var = (m16) this.Z;
                x81 x81Var = new x81(m16Var, null, (qn2) this.d0, 1);
                this.Y = 1;
                Object q = m16Var.q(false, x81Var, this);
                if (q == x61Var27) {
                    return x61Var27;
                }
                return q;
            default:
                pq5 pq5Var = (pq5) this.Z;
                x61 x61Var28 = x61.COROUTINE_SUSPENDED;
                int i33 = this.Y;
                if (i33 != 0) {
                    if (i33 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Z = null;
                this.Y = 1;
                Object e = ((xa1) this.d0).e(pq5Var, this);
                if (e == x61Var28) {
                    return x61Var28;
                }
                return e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }
}
