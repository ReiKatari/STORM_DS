package defpackage;

import android.app.DownloadManager;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.widget.Toast;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.common.providers.UpdateContentProvider;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u12  reason: default package */
/* loaded from: classes.dex */
public final class u12 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(sz1 sz1Var, Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = obj;
        this.e0 = obj2;
    }

    private final Object A(Object obj) {
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
            hf5 hf5Var = (hf5) this.e0;
            this.Y = 1;
            if (hf5Var.e((w61) this.d0, (um) this.Z, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r11 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (defpackage.sn5.e(r0, r10) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (defpackage.sn5.e(r0, r10) == r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object B(Object obj) {
        Object v;
        sn5 sn5Var = (sn5) this.d0;
        tp6 tp6Var = sn5Var.f;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        oi2.Y(obj);
                        sn5Var.h.k(jg7Var);
                        Boolean bool = Boolean.FALSE;
                        tp6Var.getClass();
                        tp6Var.m(null, bool);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                Boolean bool2 = Boolean.FALSE;
                tp6Var.getClass();
                tp6Var.m(null, bool2);
                return jg7Var;
            }
            oi2.Y(obj);
            v = ((hm5) obj).A;
        } else {
            oi2.Y(obj);
            Boolean bool3 = Boolean.TRUE;
            tp6Var.getClass();
            tp6Var.m(null, bool3);
            pn5 pn5Var = sn5Var.b;
            this.Y = 1;
            v = ((pl) pn5Var).v((String) this.e0, (String) this.Z, this);
        }
        if (!(v instanceof em5)) {
            this.Y = 2;
        } else {
            this.Y = 3;
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (defpackage.ip3.j((defpackage.ip3) r5.d0, 0, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (defpackage.pr3.l((defpackage.pr3) r5.e0, 0, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object C(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            ((ss4) this.Z).i(-1);
            this.Y = 1;
        }
        this.Y = 2;
    }

    private final Object D(Object obj) {
        Object em5Var;
        Object em5Var2;
        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.e0;
        w61 w61Var = (w61) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                pq5 pq5Var = (pq5) this.Z;
                xe1 xe1Var = xk1.a;
                de1 de1Var = de1.L;
                m5 m5Var = new m5(romDetailsActivity, pq5Var, (r41) null, 26);
                this.d0 = w61Var;
                this.Y = 1;
                obj = hv.d0(de1Var, m5Var, this);
                if (obj == x61Var) {
                    return x61Var;
                }
            }
            em5Var = (k06) obj;
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Throwable a = hm5.a(em5Var);
        jg7 jg7Var = jg7.a;
        if (a == null) {
            k06 k06Var = (k06) em5Var;
            if (k06Var == null) {
                Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_missing, 1).show();
                return jg7Var;
            }
            String str = k06Var.b;
            Uri uri = k06Var.a;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.addFlags(1);
            intent.setClipData(ClipData.newUri(romDetailsActivity.getContentResolver(), str, uri));
            try {
                romDetailsActivity.startActivity(Intent.createChooser(intent, romDetailsActivity.getString(R.string.rom_save_file_share_chooser)));
                em5Var2 = jg7Var;
            } catch (Throwable th2) {
                em5Var2 = new em5(th2);
            }
            if (hm5.a(em5Var2) != null) {
                Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_share_failed, 1).show();
            }
            return jg7Var;
        }
        Toast.makeText(romDetailsActivity, (int) R.string.rom_save_file_share_failed, 1).show();
        return jg7Var;
    }

    private final Object E(Object obj) {
        vv5 vv5Var = (vv5) this.e0;
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
            int tabIndex = vv5Var.getTabIndex();
            this.Y = 1;
            if (nr4.g((ue1) this.d0, tabIndex, this) == x61Var) {
                return x61Var;
            }
        }
        nh2.a((nh2) ((List) this.Z).get(vv5Var.getTabIndex()));
        return jg7.a;
    }

    private final Object v(Object obj) {
        qa4 qa4Var = (qa4) this.Z;
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
            zn5 zn5Var = (zn5) ((qa4) this.e0).getValue();
            if (zn5Var != null && zn5Var.a <= 0 && zn5Var.b <= 0) {
                qa4Var.setValue(Boolean.TRUE);
                jd1 jd1Var = oq1.B;
                long L = n16.L(3, uq1.SECONDS);
                this.Y = 1;
                if (q60.u(L, this) == x61Var) {
                    return x61Var;
                }
            } else {
                qa4Var.setValue(Boolean.FALSE);
                return jg7.a;
            }
        }
        ((on2) this.d0).c();
        return jg7.a;
    }

    private final Object x(Object obj) {
        zg5 zg5Var = (zg5) this.Z;
        bx4 bx4Var = (bx4) this.e0;
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
            List list = (List) this.d0;
            Log.d("PipePresenceSrc", "Flow emitted new camera set: ".concat(gt0.P0(list, null, null, null, null, 63)));
            if (bx4Var.h.get()) {
                if (zg5Var.A) {
                    Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
                    gx3 a = bx4Var.a();
                    this.Y = 1;
                    if (gi2.m(a, this) == x61Var) {
                        return x61Var;
                    }
                } else {
                    bx4Var.c(list, null);
                }
            } else {
                vy7.P(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
            }
            return jg7.a;
        }
        zg5Var.A = false;
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0020, CancellationException -> 0x00bf, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00bf, all -> 0x0020, blocks: (B:6:0x001c, B:15:0x003c, B:17:0x005e, B:18:0x006c), top: B:37:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:21:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(Object obj) {
        w61 w61Var;
        dh5 dh5Var;
        dh5 dh5Var2;
        pa paVar = (pa) this.Z;
        pu puVar = (pu) paVar.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                dh5 dh5Var3 = (dh5) this.d0;
                w61Var = (w61) this.e0;
                try {
                    oi2.Y(obj);
                    dh5Var2 = dh5Var3;
                    dh5Var = dh5Var2;
                } catch (CancellationException unused) {
                    Log.d("CXCP", "PruningProcessingQueue: Scope cancelled");
                } catch (Throwable th) {
                    th = th;
                    Log.e("CXCP", "Encountered exception during processing", th);
                }
                if (!puVar.isEmpty()) {
                    Object obj2 = dh5Var2.A;
                    dh5Var = dh5Var2;
                    if (obj2 == null) {
                        Object first = puVar.first();
                        kg1 i2 = hv.i(w61Var, null, null, new bf4(paVar, first, null, 8), 3);
                        if (i2.isCancelled()) {
                            Log.i("CXCP", "Unable to process " + first + " due to Job cancellation");
                            th = null;
                            pa.a(paVar, th);
                            if (th == null) {
                                return null;
                            }
                            throw th;
                        }
                        puVar.removeFirst();
                        dh5Var2.A = i2;
                        dh5Var = dh5Var2;
                    }
                }
                if (g04.H(w61Var)) {
                    l61 l61Var = this.B;
                    l61Var.getClass();
                    v96 v96Var = new v96(l61Var);
                    v96Var.h(((v80) paVar.Y).w(), new m5(paVar, null, 23));
                    jg1 jg1Var = (jg1) dh5Var.A;
                    if (jg1Var != null) {
                        v96Var.h(jg1Var.n(), new y3(dh5Var, (r41) null, 13));
                    }
                    this.e0 = w61Var;
                    this.d0 = dh5Var;
                    this.Y = 1;
                    dh5Var2 = dh5Var;
                    if (v96Var.e(this) == x61Var) {
                        return x61Var;
                    }
                    dh5Var = dh5Var2;
                    if (!puVar.isEmpty()) {
                    }
                    if (g04.H(w61Var)) {
                    }
                }
                th = null;
                pa.a(paVar, th);
                if (th == null) {
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            w61Var = (w61) this.e0;
            dh5Var = new Object();
            if (g04.H(w61Var)) {
            }
            th = null;
            pa.a(paVar, th);
            if (th == null) {
            }
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((u12) q((r41) obj2, (List) obj)).s(jg7Var);
            case 6:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((u12) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 12:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((u12) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 18:
                return ((u12) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 19:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 20:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((u12) q((r41) obj2, (List) obj)).s(jg7Var);
            case 22:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 25:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((u12) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new u12((v80) this.e0, (sz1) this.Z, r41Var, 0);
            case 1:
                return new u12((sz1) this.Z, (Object) ((pq5) this.e0), r41Var, 1);
            case 2:
                return new u12((sz1) this.Z, (Object) ((r85) this.e0), r41Var, 2);
            case 3:
                return new u12((sz1) this.Z, (Object) ((jb5) this.d0), (Object) ((dy1) this.e0), r41Var, 3);
            case 4:
                return new u12((sz1) this.Z, (Object) ((x85) this.d0), (Object) ((vs3) this.e0), r41Var, 4);
            case 5:
                u12 u12Var = new u12((sz1) this.Z, (Object) ((nv4) this.e0), r41Var, 5);
                u12Var.d0 = obj;
                return u12Var;
            case 6:
                return new u12((sz1) this.d0, (pq5) this.e0, r41Var);
            case 7:
                u12 u12Var2 = new u12((fo2) this.e0, (ne2) this.Z, r41Var, 7);
                u12Var2.d0 = obj;
                return u12Var2;
            case 8:
                return new u12((r94) this.d0, (t93) this.e0, (il1) this.Z, r41Var, 8);
            case 9:
                return new u12((SurfaceView) this.d0, (Bitmap) this.e0, (hq2) this.Z, r41Var, 9);
            case 10:
                return new u12((hq2) this.d0, (Bitmap) this.e0, (String) this.Z, r41Var, 10);
            case 11:
                u12 u12Var3 = new u12((hs2) this.e0, (kt) this.Z, r41Var, 11);
                u12Var3.d0 = obj;
                return u12Var3;
            case 12:
                return new u12((v80) this.e0, r41Var);
            case 13:
                return new u12((ha3) this.Z, r41Var, 13);
            case 14:
                return new u12((wa3) this.Z, r41Var, 14);
            case 15:
                u12 u12Var4 = new u12((eo2) this.e0, (qb0) this.Z, r41Var, 15);
                u12Var4.d0 = obj;
                return u12Var4;
            case 16:
                return new u12((n96) this.d0, (qa4) this.e0, (rs4) this.Z, r41Var, 16);
            case 17:
                u12 u12Var5 = new u12((Context) this.Z, r41Var, 17);
                u12Var5.e0 = obj;
                return u12Var5;
            case 18:
                u12 u12Var6 = new u12((p21) this.e0, (cf4) this.Z, r41Var, 18);
                u12Var6.d0 = obj;
                return u12Var6;
            case 19:
                return new u12((oj4) this.d0, (String) this.e0, (String) this.Z, r41Var, 19);
            case 20:
                return new u12((on2) this.d0, (qa4) this.e0, (qa4) this.Z, r41Var, 20);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                u12 u12Var7 = new u12((bx4) this.e0, (zg5) this.Z, r41Var, 21);
                u12Var7.d0 = obj;
                return u12Var7;
            case 22:
                return new u12((dh5) this.e0, (iz4) this.Z, r41Var, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                u12 u12Var8 = new u12((pa) this.Z, r41Var, 23);
                u12Var8.e0 = obj;
                return u12Var8;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                u12 u12Var9 = new u12((hf5) this.e0, (um) this.Z, r41Var, 24);
                u12Var9.d0 = obj;
                return u12Var9;
            case 25:
                return new u12((sn5) this.d0, (String) this.e0, (String) this.Z, r41Var, 25);
            case SubAllocator.N4 /* 26 */:
                return new u12((ip3) this.d0, (pr3) this.e0, (ss4) this.Z, r41Var, 26);
            case 27:
                u12 u12Var10 = new u12((RomDetailsActivity) this.e0, (pq5) this.Z, r41Var, 27);
                u12Var10.d0 = obj;
                return u12Var10;
            case 28:
                return new u12((ue1) this.d0, (vv5) this.e0, (List) this.Z, r41Var, 28);
            default:
                return new u12((qn2) this.e0, (qa4) this.Z, r41Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ca, code lost:
        if (r4.a(r3, r19) == r7) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cd, code lost:
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02db, code lost:
        if (r4.a(r3, r19) == r7) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ea, code lost:
        if (r4.a(r3, r19) == r7) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0302, code lost:
        if (r3.b(r4, r19) != r7) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0305, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x05af, code lost:
        if (r10.a(r3, r19) == r11) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05b1, code lost:
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05cf, code lost:
        if (r10.a(r3, r19) == r11) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x068a, code lost:
        if (r3.b(r10, r19) == r0) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x069e, code lost:
        if (r10.a(r3, r19) == r0) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07ca, code lost:
        if (r4 == r2) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x07e3, code lost:
        if (r1 == r2) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07e6, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x08b3, code lost:
        if (r4 == r3) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x08d4, code lost:
        if (r2.a(r7, r19) == r3) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0960, code lost:
        if (r3 == r0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0980, code lost:
        if (defpackage.q60.u(r3, r19) == r0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0990, code lost:
        if (defpackage.sz1.D((defpackage.sz1) r19.Z, r19) == r0) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:?, code lost:
        return r0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0515 A[Catch: all -> 0x04e9, TryCatch #8 {all -> 0x04e9, blocks: (B:245:0x04e3, B:255:0x050d, B:257:0x0515, B:258:0x0522, B:265:0x0532, B:252:0x04ff, B:267:0x0535, B:251:0x04fa, B:259:0x0523, B:261:0x0529), top: B:481:0x04d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x053c  */
    /* JADX WARN: Type inference failed for: r12v12, types: [zg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v46, types: [ul0] */
    /* JADX WARN: Type inference failed for: r3v48, types: [v80] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [ul0] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x0509 -> B:255:0x050d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:464:0x0990 -> B:455:0x0958). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        n80 n80Var;
        Object obj2;
        Object Q;
        tp6 tp6Var;
        Object h;
        o75 o75Var;
        sz1 sz1Var;
        Object Q2;
        x61 x61Var;
        n80 n80Var2;
        Object b;
        boolean z;
        ha3 ha3Var;
        hb4 hb4Var;
        wa3 wa3Var;
        hb4 hb4Var2;
        Object o;
        on2 u6Var;
        Object w21Var;
        boolean canBeSatisfiedBy;
        Object a;
        dh5 dh5Var;
        Object g;
        qa4 qa4Var;
        ?? r3 = 16;
        boolean z2 = false;
        CancellationException cancellationException = null;
        switch (this.X) {
            case 0:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                n80Var = (n80) this.d0;
                                oi2.Y(obj);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            n80Var = (n80) this.d0;
                            oi2.Y(obj);
                            this.d0 = n80Var;
                            this.Y = 3;
                            break;
                        }
                    } else {
                        n80Var = (n80) this.d0;
                        oi2.Y(obj);
                        obj2 = obj;
                        if (((Boolean) obj2).booleanValue()) {
                            n80Var.c();
                            jd1 jd1Var = oq1.B;
                            long L = n16.L(750, uq1.MILLISECONDS);
                            this.d0 = n80Var;
                            this.Y = 2;
                            break;
                        } else {
                            return jg7.a;
                        }
                    }
                } else {
                    oi2.Y(obj);
                    n80Var = new n80((v80) this.e0);
                }
                this.d0 = n80Var;
                this.Y = 1;
                obj2 = n80Var.b(this);
                break;
            case 1:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        tp6Var = (tp6) this.d0;
                        oi2.Y(obj);
                        Q = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    sz1 sz1Var2 = (sz1) this.Z;
                    tp6 tp6Var2 = sz1Var2.p0;
                    this.d0 = tp6Var2;
                    this.Y = 1;
                    Q = sz1.Q(sz1Var2, (pq5) this.e0, this);
                    if (Q == x61Var3) {
                        return x61Var3;
                    }
                    tp6Var = tp6Var2;
                }
                gy1 gy1Var = new gy1((pq5) Q);
                tp6Var.getClass();
                tp6Var.m(null, gy1Var);
                return jg7.a;
            case 2:
                r85 r85Var = (r85) this.e0;
                sz1 sz1Var3 = (sz1) this.Z;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    h = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var3.g;
                    long j = r85Var.a;
                    this.Y = 1;
                    h = ((pl) pn5Var).h(j, this);
                    break;
                }
                if (!(h instanceof em5) && (o75Var = (o75) h) != null) {
                    of6 of6Var = sz1Var3.F0;
                    o95 o95Var = new o95(o75Var, r85Var.b, r85Var.c, r85Var.d);
                    this.d0 = h;
                    this.Y = 2;
                    break;
                }
                return jg7.a;
            case 3:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var = ((sz1) this.Z).i;
                String a2 = ((jb5) this.d0).a();
                String str = ((dy1) this.e0).a.i;
                this.Y = 1;
                Object g2 = oj4Var.g(a2, str, this);
                if (g2 != x61Var5) {
                    return g2;
                }
                return x61Var5;
            case 4:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (sz1.V((sz1) this.Z, (x85) this.d0, (vs3) this.e0, this) == x61Var6) {
                        return x61Var6;
                    }
                }
                return jg7.a;
            case 5:
                List list = (List) this.d0;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.d0 = null;
                this.Y = 1;
                Object k = sz1.k((sz1) this.Z, (nv4) this.e0, list, this);
                if (k == x61Var7) {
                    return x61Var7;
                }
                return k;
            case 6:
                jg7 jg7Var = jg7.a;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sz1Var = (sz1) this.Z;
                    oi2.Y(obj);
                    Q2 = obj;
                } else {
                    oi2.Y(obj);
                    sz1Var = (sz1) this.d0;
                    this.Z = sz1Var;
                    this.Y = 1;
                    Q2 = sz1.Q(sz1Var, (pq5) this.e0, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                sz1Var.getClass();
                Object C = g04.C(new z12(sz1Var, (pq5) Q2, null), this);
                if (C != x61Var8) {
                    C = jg7Var;
                    break;
                }
                break;
            case 7:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    fo2 fo2Var = (fo2) this.e0;
                    this.Y = 1;
                    if (fo2Var.e((w61) this.d0, (ne2) this.Z, this) == x61Var9) {
                        return x61Var9;
                    }
                }
                return jg7.a;
            case 8:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((r94) this.d0).a((t93) this.e0, this) == x61Var10) {
                        return x61Var10;
                    }
                }
                il1 il1Var = (il1) this.Z;
                if (il1Var != null) {
                    il1Var.dispose();
                }
                return jg7.a;
            case 9:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                SurfaceView surfaceView = (SurfaceView) this.d0;
                Bitmap bitmap = (Bitmap) this.e0;
                hq2 hq2Var = (hq2) this.Z;
                this.Y = 1;
                rj0 rj0Var = new rj0(1, np2.V(this));
                rj0Var.v();
                try {
                    PixelCopy.request(surfaceView, bitmap, new bq2(rj0Var, bitmap, 0), hq2Var.k);
                } catch (Throwable unused) {
                    if (rj0Var.u() instanceof sg4) {
                        rj0Var.G(null, null);
                    }
                }
                Object s = rj0Var.s();
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                if (s != x61Var11) {
                    return s;
                }
                return x61Var11;
            case 10:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                wp2 wp2Var = ((hq2) this.d0).h;
                Bitmap bitmap2 = (Bitmap) this.e0;
                String str2 = (String) this.Z;
                yt1 yt1Var = yt1.A;
                this.Y = 1;
                wp2Var.getClass();
                Object d0 = hv.d0(xk1.a, new up2(wp2Var, bitmap2, yt1Var, str2, null), this);
                if (d0 != x61Var13) {
                    return d0;
                }
                return x61Var13;
            case 11:
                kt ktVar = (kt) this.Z;
                km1 km1Var = km1.a;
                jg7 jg7Var2 = jg7.a;
                hs2 hs2Var = (hs2) this.e0;
                ne2 ne2Var = (ne2) this.d0;
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Context context = hs2Var.a;
                    Context context2 = hs2Var.a;
                    File externalCacheDir = context.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        File file = new File(externalCacheDir, "updates");
                        if (!file.isDirectory() && !file.mkdirs()) {
                            this.d0 = null;
                            this.Y = 1;
                            break;
                        } else {
                            File file2 = new File(file, "update.apk");
                            if (file2.isFile() && !file2.delete()) {
                                this.d0 = null;
                                this.Y = 2;
                                break;
                            } else {
                                String str3 = ktVar.i;
                                Uri uri = ktVar.c;
                                if (xs6.g0(str3, "https://github.com/ReiKatari/STORM_DS/releases/tag/", false)) {
                                    String uri2 = uri.toString();
                                    uri2.getClass();
                                    if (xs6.g0(uri2, "https://github.com/ReiKatari/STORM_DS/releases/download/", false)) {
                                        int i13 = UpdateContentProvider.A;
                                        Uri fromFile = Uri.fromFile(file2);
                                        Uri build = new Uri.Builder().authority(context2.getPackageName() + ".provider").scheme("file").path(fromFile.getPath()).query(fromFile.getQuery()).fragment(fromFile.getFragment()).build();
                                        build.getClass();
                                        Object systemService = context2.getSystemService(DownloadManager.class);
                                        systemService.getClass();
                                        DownloadManager downloadManager = (DownloadManager) systemService;
                                        DownloadManager.Request request = new DownloadManager.Request(uri);
                                        request.setDestinationUri(build);
                                        request.setNotificationVisibility(1);
                                        request.setMimeType("application/vnd.android.package-archive");
                                        request.setTitle("Downloading update " + ktVar.d + "...");
                                        x61Var = x61Var14;
                                        pb0 p = f04.p(new n31(downloadManager.enqueue(request), hs2Var, downloadManager, (kt) this.Z, file2, (r41) null));
                                        this.d0 = null;
                                        this.Y = 4;
                                        break;
                                    }
                                }
                                x61Var = x61Var14;
                                Log.w("GitHubUpdateInstall", "Rejected update with an unexpected GitHub release origin");
                                this.d0 = null;
                                this.Y = 3;
                                break;
                            }
                        }
                        return x61Var;
                    }
                }
                return jg7Var2;
            case 12:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            n80Var2 = (n80) this.d0;
                            ul0 ul0Var = (ul0) this.Z;
                            oi2.Y(obj);
                            b = obj;
                            r3 = ul0Var;
                            if (((Boolean) b).booleanValue()) {
                                jg7 jg7Var3 = (jg7) n80Var2.c();
                                ps2.b.set(false);
                                synchronized (bm6.c) {
                                    ka4 ka4Var = bm6.j.h;
                                    if (ka4Var != null && ka4Var.h()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    bm6.a();
                                }
                                this.Z = r3;
                                this.d0 = n80Var2;
                                this.Y = 1;
                                b = n80Var2.b(this);
                                r3 = r3;
                                if (b == x61Var15) {
                                    return x61Var15;
                                }
                                if (((Boolean) b).booleanValue()) {
                                    r3.h(null);
                                    return jg7.a;
                                }
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        r3 = (v80) this.e0;
                        n80Var2 = new n80(r3);
                        this.Z = r3;
                        this.d0 = n80Var2;
                        this.Y = 1;
                        b = n80Var2.b(this);
                        r3 = r3;
                        if (b == x61Var15) {
                        }
                        if (((Boolean) b).booleanValue()) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (th instanceof CancellationException) {
                            cancellationException = th;
                        }
                        if (cancellationException == null) {
                            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException.initCause(th);
                        }
                        r3.h(cancellationException);
                        throw th2;
                    }
                }
                break;
            case 13:
                jg7 jg7Var4 = jg7.a;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ha3Var = (ha3) this.e0;
                        hb4Var = (hb4) this.d0;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ha3 ha3Var2 = (ha3) this.Z;
                    hb4 hb4Var3 = ha3Var2.d;
                    this.d0 = hb4Var3;
                    this.e0 = ha3Var2;
                    this.Y = 1;
                    if (hb4Var3.e(this) == x61Var16) {
                        return x61Var16;
                    }
                    ha3Var = ha3Var2;
                    hb4Var = hb4Var3;
                }
                try {
                    if (!ha3Var.e) {
                        Collection<n00> collection = yt1.A;
                        File file3 = new File(ha3Var.a.getFilesDir(), "backgrounds.json");
                        if (file3.isFile()) {
                            try {
                                Collection collection2 = (List) ha3Var.b.b(new FileReader(file3), ha3.g);
                                if (collection2 != null) {
                                    collection = collection2;
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        ArrayList arrayList = new ArrayList(ht0.v0(collection, 10));
                        for (n00 n00Var : collection) {
                            arrayList.add(new fh1(false, n00Var));
                        }
                        tp6 tp6Var3 = ha3Var.f;
                        tp6Var3.getClass();
                        tp6Var3.m(null, arrayList);
                        ha3Var.e = true;
                    }
                    hb4Var.h(null);
                    return jg7Var4;
                } catch (Throwable th3) {
                    hb4Var.h(null);
                    throw th3;
                }
            case 14:
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        wa3Var = (wa3) this.e0;
                        hb4Var2 = (hb4) this.d0;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wa3 wa3Var2 = (wa3) this.Z;
                    hb4 hb4Var4 = wa3Var2.d;
                    this.d0 = hb4Var4;
                    this.e0 = wa3Var2;
                    this.Y = 1;
                    if (hb4Var4.e(this) == x61Var17) {
                        return x61Var17;
                    }
                    wa3Var = wa3Var2;
                    hb4Var2 = hb4Var4;
                }
                try {
                    if (!wa3Var.e) {
                        List<fk3> a3 = wa3.a(wa3Var);
                        ArrayList arrayList2 = new ArrayList(ht0.v0(a3, 10));
                        for (fk3 fk3Var : a3) {
                            arrayList2.add(new fh1(false, fk3Var));
                        }
                        tp6 tp6Var4 = wa3Var.f;
                        kw3 I = hf.I();
                        I.add(new fh1(false, new fk3(fk3.h, wa3Var.a.getString(R.string.default_layout_name), dk3.DEFAULT, ck3.FOLLOW_SYSTEM, false, 50, zt1.A)));
                        I.addAll(arrayList2);
                        tp6Var4.l(hf.A(I));
                        wa3Var.e = true;
                    }
                    hb4Var2.h(null);
                    return jg7.a;
                } catch (Throwable th4) {
                    hb4Var2.h(null);
                    throw th4;
                }
            case 15:
                qb0 qb0Var = (qb0) this.Z;
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                try {
                    if (i17 != 0) {
                        if (i17 == 1) {
                            oi2.Y(obj);
                            o = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        w61 w61Var = (w61) this.d0;
                        this.Y = 1;
                        o = ((eo2) this.e0).o(w61Var, this);
                        if (o == x61Var18) {
                            return x61Var18;
                        }
                    }
                    qb0Var.a(o);
                } catch (CancellationException unused3) {
                    qb0Var.b();
                } catch (Throwable th5) {
                    qb0Var.c(th5);
                }
                return jg7.a;
            case 16:
                qa4 qa4Var2 = (qa4) this.e0;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
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
                    if (((List) qa4Var2.getValue()).size() > 1) {
                        n96 n96Var = (n96) this.d0;
                        float h2 = ((rs4) this.Z).h();
                        this.Y = 1;
                        if (n96Var.v(h2, (sb4) ((List) qa4Var2.getValue()).get(((List) qa4Var2.getValue()).size() - 2), this) == x61Var19) {
                            return x61Var19;
                        }
                    }
                }
                return jg7.a;
            case 17:
                jg7 jg7Var5 = jg7.a;
                ne2 ne2Var2 = (ne2) this.e0;
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 != 1 && i19 != 2 && i19 != 3) {
                        if (i19 == 4) {
                            oi2.Y(obj);
                            return jg7Var5;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.d0;
                    oi2.Y(obj);
                    pb0 p2 = f04.p(new xd1(connectivityManager, null, 29));
                    this.e0 = null;
                    this.d0 = null;
                    this.Y = 4;
                    break;
                } else {
                    oi2.Y(obj);
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) ((Context) this.Z).getSystemService(ConnectivityManager.class);
                    if (connectivityManager2 != null) {
                        Network activeNetwork = connectivityManager2.getActiveNetwork();
                        if (activeNetwork != null) {
                            NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                                ue4 ue4Var = ue4.CONNECTED;
                                this.e0 = ne2Var2;
                                this.d0 = connectivityManager2;
                                this.Y = 1;
                                break;
                            } else {
                                ue4 ue4Var2 = ue4.DISCONNECTED;
                                this.e0 = ne2Var2;
                                this.d0 = connectivityManager2;
                                this.Y = 2;
                                break;
                            }
                        } else {
                            ue4 ue4Var3 = ue4.DISCONNECTED;
                            this.e0 = ne2Var2;
                            this.d0 = connectivityManager2;
                            this.Y = 3;
                            break;
                        }
                        pb0 p22 = f04.p(new xd1(connectivityManager, null, 29));
                        this.e0 = null;
                        this.d0 = null;
                        this.Y = 4;
                    }
                    return jg7Var5;
                }
            case 18:
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
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
                    r35 r35Var = (r35) this.d0;
                    NetworkRequest a4 = ((p21) this.e0).a();
                    if (a4 == null) {
                        kf4 kf4Var = ((p21) this.e0).a;
                        kf4Var.getClass();
                        if (kf4Var == kf4.NOT_REQUIRED) {
                            a4 = null;
                        } else {
                            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT >= 30 && kf4Var == kf4.TEMPORARILY_UNMETERED) {
                                a4 = removeCapability.addCapability(25).build();
                            } else {
                                int i21 = lf4.a[kf4Var.ordinal()];
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        if (i21 == 3) {
                                            removeCapability = removeCapability.addCapability(18);
                                        }
                                    } else {
                                        removeCapability = removeCapability.addCapability(11);
                                    }
                                } else {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                                a4 = removeCapability.build();
                            }
                        }
                    }
                    if (a4 == null) {
                        r35Var.getClass();
                        r35Var.w0(null);
                        return jg7.a;
                    }
                    bi2 bi2Var = new bi2(28, hv.L(r35Var, null, null, new bf4((cf4) this.Z, r35Var, null, 0), 3), r35Var);
                    if (Build.VERSION.SDK_INT >= 30) {
                        rf6 rf6Var = rf6.a;
                        ConnectivityManager connectivityManager3 = ((cf4) this.Z).a;
                        rf6Var.getClass();
                        synchronized (rf6.b) {
                            try {
                                LinkedHashMap linkedHashMap = rf6.c;
                                boolean isEmpty = linkedHashMap.isEmpty();
                                linkedHashMap.put(bi2Var, a4);
                                if (isEmpty) {
                                    ga0.f().b(zv7.a, "NetworkRequestConstraintController register shared callback");
                                    connectivityManager3.registerDefaultNetworkCallback(rf6Var);
                                } else if (rf6.e && rf6.f != null) {
                                    ga0.f().b(zv7.a, "NetworkRequestConstraintController send initial capabilities");
                                    NetworkCapabilities networkCapabilities2 = rf6.d;
                                    Boolean bool = rf6.f;
                                    bool.getClass();
                                    if (!bool.booleanValue()) {
                                        canBeSatisfiedBy = a4.canBeSatisfiedBy(networkCapabilities2);
                                        if (canBeSatisfiedBy) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        w21Var = v21.a;
                                    } else {
                                        w21Var = new w21(7);
                                    }
                                    bi2Var.g(w21Var);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        u6Var = new ci2(27, bi2Var, connectivityManager3);
                    } else {
                        int i22 = c53.c;
                        ConnectivityManager connectivityManager4 = ((cf4) this.Z).a;
                        c53 c53Var = new c53(bi2Var);
                        ?? obj3 = new Object();
                        try {
                            ga0.f().b(zv7.a, "NetworkRequestConstraintController register callback");
                            connectivityManager4.registerNetworkCallback(a4, c53Var);
                            obj3.A = true;
                        } catch (RuntimeException e) {
                            if (xs6.Y(e.getClass().getName(), "TooManyRequestsException", false)) {
                                ga0.f().c(zv7.a, "NetworkRequestConstraintController couldn't register callback", e);
                                bi2Var.g(new w21(7));
                            } else {
                                throw e;
                            }
                        }
                        u6Var = new u6((Object) obj3, connectivityManager4, c53Var, 10);
                    }
                    x7 x7Var = new x7(12, u6Var);
                    this.Y = 1;
                    if (kj2.q(r35Var, x7Var, this) == x61Var21) {
                        return x61Var21;
                    }
                }
                return jg7.a;
            case 19:
                Object obj4 = jg7.a;
                x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                try {
                    if (i23 != 0) {
                        if (i23 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        vi viVar = ((oj4) this.d0).a;
                        this.Y = 1;
                        kh khVar = viVar.a;
                        File a5 = viVar.a((String) this.e0, (String) this.Z);
                        khVar.getClass();
                        xe1 xe1Var = xk1.a;
                        Object d02 = hv.d0(de1.L, new y3(a5, (r41) null, 3), this);
                        if (d02 != x61Var22) {
                            d02 = obj4;
                        }
                        if (d02 == x61Var22) {
                            return x61Var22;
                        }
                    }
                } catch (Exception e2) {
                    obj4 = new em5(e2);
                }
                return new hm5(obj4);
            case 20:
                return v(obj);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return x(obj);
            case 22:
                x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                int i24 = this.Y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        dh5Var = (dh5) this.d0;
                        oi2.Y(obj);
                        a = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    dh5 dh5Var2 = (dh5) this.e0;
                    this.d0 = dh5Var2;
                    this.Y = 1;
                    a = ((iz4) this.Z).a(this);
                    if (a == x61Var23) {
                        return x61Var23;
                    }
                    dh5Var = dh5Var2;
                }
                dh5Var.A = a;
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                return z(obj);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return A(obj);
            case 25:
                return B(obj);
            case SubAllocator.N4 /* 26 */:
                return C(obj);
            case 27:
                return D(obj);
            case 28:
                return E(obj);
            default:
                x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qa4Var = (qa4) this.d0;
                        oi2.Y(obj);
                        g = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qa4 qa4Var3 = (qa4) this.Z;
                    this.d0 = qa4Var3;
                    this.Y = 1;
                    g = ((qn2) this.e0).g(this);
                    if (g == x61Var24) {
                        return x61Var24;
                    }
                    qa4Var = qa4Var3;
                }
                pq4 pq4Var = px5.a;
                qa4Var.setValue((ix5) g);
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(sz1 sz1Var, pq5 pq5Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 6;
        this.d0 = sz1Var;
        this.e0 = pq5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(sz1 sz1Var, Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.e0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(v80 v80Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 12;
        this.e0 = v80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
        this.Z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u12(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.Z = obj3;
    }
}
