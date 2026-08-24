package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.MelonDSiNand;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg  reason: default package */
/* loaded from: classes.dex */
public final class fg {
    public final Context a;
    public final kd6 b;
    public final fb2 c;
    public final db1 d;
    public final hb4 e = new hb4();
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);

    public fg(Context context, kd6 kd6Var, nh4 nh4Var, fb2 fb2Var, db1 db1Var) {
        this.a = context;
        this.b = kd6Var;
        this.c = fb2Var;
        this.d = db1Var;
    }

    public static final String a(fg fgVar, int i) {
        g04.y(16);
        return qs6.B0(8, jx2.R(16, i & 4294967295L));
    }

    public final void b() {
        if (this.f.decrementAndGet() == 0) {
            this.g.set(false);
            MelonDSiNand.a.closeNand();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:17:0x0046, B:22:0x0054), top: B:28:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(DSiWareTitle dSiWareTitle, s41 s41Var) {
        wf wfVar;
        int i;
        hb4 hb4Var;
        boolean z;
        try {
            if (s41Var instanceof wf) {
                wfVar = (wf) s41Var;
                int i2 = wfVar.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wfVar.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = wfVar.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = wfVar.d0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4 hb4Var2 = wfVar.X;
                            DSiWareTitle dSiWareTitle2 = wfVar.R;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            dSiWareTitle = dSiWareTitle2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        wfVar.R = dSiWareTitle;
                        hb4Var = this.e;
                        wfVar.X = hb4Var;
                        wfVar.d0 = 1;
                        if (hb4Var.e(wfVar) == x61Var) {
                            return x61Var;
                        }
                    }
                    z = this.g.get();
                    jg7 jg7Var = jg7.a;
                    if (z) {
                        return jg7Var;
                    }
                    MelonDSiNand.a.deleteTitle((int) (dSiWareTitle.getTitleId() & 4294967295L));
                    return jg7Var;
                }
            }
            z = this.g.get();
            jg7 jg7Var2 = jg7.a;
            if (z) {
            }
        } finally {
            hb4Var.h(null);
        }
        wfVar = new wf(this, s41Var);
        Object obj2 = wfVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = wfVar.d0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:17:0x004a, B:19:0x0052, B:24:0x005a), top: B:29:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:17:0x004a, B:19:0x0052, B:24:0x005a), top: B:29:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, String str, s41 s41Var) {
        xf xfVar;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof xf) {
                xfVar = (xf) s41Var;
                int i2 = xfVar.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xfVar.e0 = i2 - Integer.MIN_VALUE;
                    Object obj = xfVar.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = xfVar.e0;
                    if (i == 0) {
                        if (i == 1) {
                            j = xfVar.R;
                            hb4 hb4Var2 = xfVar.Y;
                            String str2 = xfVar.X;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            str = str2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        xfVar.X = str;
                        hb4Var = this.e;
                        xfVar.Y = hb4Var;
                        xfVar.R = j;
                        xfVar.e0 = 1;
                        if (hb4Var.e(xfVar) == x61Var) {
                            return x61Var;
                        }
                    }
                    if (this.g.get()) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(MelonDSiNand.a.exportTitleExecutable((int) (j & 4294967295L), str));
                }
            }
            if (this.g.get()) {
            }
        } finally {
            hb4Var.h(null);
        }
        xfVar = new xf(this, s41Var);
        Object obj2 = xfVar.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = xfVar.e0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:17:0x004e, B:19:0x0056, B:24:0x005e), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(DSiWareTitle dSiWareTitle, bb1 bb1Var, Uri uri, s41 s41Var) {
        yf yfVar;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof yf) {
                yfVar = (yf) s41Var;
                int i2 = yfVar.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yfVar.f0 = i2 - Integer.MIN_VALUE;
                    Object obj = yfVar.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = yfVar.f0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4 hb4Var2 = yfVar.Z;
                            uri = yfVar.Y;
                            bb1Var = yfVar.X;
                            DSiWareTitle dSiWareTitle2 = yfVar.R;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            dSiWareTitle = dSiWareTitle2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        yfVar.R = dSiWareTitle;
                        yfVar.X = bb1Var;
                        yfVar.Y = uri;
                        hb4Var = this.e;
                        yfVar.Z = hb4Var;
                        yfVar.f0 = 1;
                        if (hb4Var.e(yfVar) == x61Var) {
                            return x61Var;
                        }
                    }
                    if (this.g.get()) {
                        return Boolean.FALSE;
                    }
                    int ordinal = bb1Var.ordinal();
                    String uri2 = uri.toString();
                    uri2.getClass();
                    return Boolean.valueOf(MelonDSiNand.a.exportTitleFile((int) (dSiWareTitle.getTitleId() & 4294967295L), ordinal, uri2));
                }
            }
            if (this.g.get()) {
            }
        } finally {
            hb4Var.h(null);
        }
        yfVar = new yf(this, s41Var);
        Object obj2 = yfVar.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = yfVar.f0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Type inference failed for: r2v4, types: [fb4] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [fb4] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [fb4] */
    /* JADX WARN: Type inference failed for: r9v9, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum f(Uri uri, s41 s41Var) {
        zf zfVar;
        x61 x61Var;
        int i;
        hb4 hb4Var;
        int i2;
        Throwable th;
        hb4 hb4Var2;
        Object d0;
        try {
            try {
                if (s41Var instanceof zf) {
                    zfVar = (zf) s41Var;
                    int i3 = zfVar.e0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zfVar.e0 = i3 - Integer.MIN_VALUE;
                        Object obj = zfVar.Z;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = zfVar.e0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    hb4Var2 = zfVar.X;
                                    try {
                                        oi2.Y(obj);
                                        hb4Var2 = hb4Var2;
                                        t33 t33Var = (t33) obj;
                                        hb4Var2.h(null);
                                        return t33Var;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hb4Var2.h(null);
                                        throw th;
                                    }
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i4 = zfVar.Y;
                            ?? r2 = zfVar.X;
                            Uri uri2 = zfVar.R;
                            oi2.Y(obj);
                            hb4Var = r2;
                            i2 = i4;
                            uri = uri2;
                        } else {
                            oi2.Y(obj);
                            zfVar.R = uri;
                            hb4Var = this.e;
                            zfVar.X = hb4Var;
                            zfVar.Y = 0;
                            zfVar.e0 = 1;
                            if (hb4Var.e(zfVar) != x61Var) {
                                i2 = 0;
                            }
                            return x61Var;
                        }
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        ag agVar = new ag(this, uri, null, 0);
                        zfVar.R = null;
                        zfVar.X = hb4Var;
                        zfVar.Y = i2;
                        zfVar.e0 = 2;
                        d0 = hv.d0(de1Var, agVar, zfVar);
                        if (d0 != x61Var) {
                            hb4 hb4Var3 = hb4Var;
                            obj = d0;
                            hb4Var2 = hb4Var3;
                            t33 t33Var2 = (t33) obj;
                            hb4Var2.h(null);
                            return t33Var2;
                        }
                        return x61Var;
                    }
                }
                ag agVar2 = new ag(this, uri, null, 0);
                zfVar.R = null;
                zfVar.X = hb4Var;
                zfVar.Y = i2;
                zfVar.e0 = 2;
                d0 = hv.d0(de1Var, agVar2, zfVar);
                if (d0 != x61Var) {
                }
                return x61Var;
            } catch (Throwable th3) {
                th = th3;
                hb4Var2 = hb4Var;
                hb4Var2.h(null);
                throw th;
            }
            xe1 xe1Var2 = xk1.a;
            de1 de1Var2 = de1.L;
        } catch (Throwable th4) {
            th = th4;
        }
        zfVar = new zf(this, s41Var);
        Object obj2 = zfVar.Z;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = zfVar.e0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #10 {all -> 0x0060, blocks: (B:18:0x0052, B:20:0x005a, B:25:0x0063, B:28:0x0076, B:52:0x00d2, B:55:0x00d9, B:65:0x0104, B:67:0x010a, B:68:0x0111, B:29:0x0094, B:34:0x00aa, B:49:0x00c4, B:50:0x00cb, B:47:0x00c0, B:48:0x00c3, B:58:0x00df), top: B:80:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0060, blocks: (B:18:0x0052, B:20:0x005a, B:25:0x0063, B:28:0x0076, B:52:0x00d2, B:55:0x00d9, B:65:0x0104, B:67:0x010a, B:68:0x0111, B:29:0x0094, B:34:0x00aa, B:49:0x00c4, B:50:0x00cb, B:47:0x00c0, B:48:0x00c3, B:58:0x00df), top: B:80:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(DSiWareTitle dSiWareTitle, bb1 bb1Var, Uri uri, s41 s41Var) {
        bg bgVar;
        int i;
        DSiWareTitle dSiWareTitle2;
        hb4 hb4Var;
        Context context = this.a;
        try {
            if (s41Var instanceof bg) {
                bgVar = (bg) s41Var;
                int i2 = bgVar.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bgVar.f0 = i2 - Integer.MIN_VALUE;
                    Object obj = bgVar.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = bgVar.f0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4Var = bgVar.Z;
                            uri = bgVar.Y;
                            bb1Var = bgVar.X;
                            dSiWareTitle2 = bgVar.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        bgVar.R = dSiWareTitle;
                        bgVar.X = bb1Var;
                        bgVar.Y = uri;
                        hb4 hb4Var2 = this.e;
                        bgVar.Z = hb4Var2;
                        bgVar.f0 = 1;
                        if (hb4Var2.e(bgVar) == x61Var) {
                            return x61Var;
                        }
                        dSiWareTitle2 = dSiWareTitle;
                        hb4Var = hb4Var2;
                    }
                    if (this.g.get()) {
                        return Boolean.FALSE;
                    }
                    boolean k = nb3.k(uri.getScheme(), "content");
                    MelonDSiNand melonDSiNand = MelonDSiNand.a;
                    if (k) {
                        File cacheDir = context.getCacheDir();
                        long currentTimeMillis = System.currentTimeMillis();
                        File file = new File(cacheDir, "dsiware_import_data_" + currentTimeMillis + ".bin");
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        if (openInputStream != null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                long w = f04.w(openInputStream, fileOutputStream);
                                fileOutputStream.close();
                                openInputStream.close();
                                if (new Long(w) instanceof em5) {
                                    try {
                                        file.delete();
                                    } catch (Throwable unused) {
                                    }
                                    return Boolean.FALSE;
                                }
                                int titleId = (int) (dSiWareTitle2.getTitleId() & 4294967295L);
                                int ordinal = bb1Var.ordinal();
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                Boolean valueOf = Boolean.valueOf(melonDSiNand.importTitleFile(titleId, ordinal, absolutePath));
                                try {
                                    file.delete();
                                } catch (Throwable unused2) {
                                }
                                return valueOf;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ge7.t(openInputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        throw new EOFException("Unable to open content URI");
                    }
                    String path = uri.getPath();
                    if (path == null) {
                        path = uri.toString();
                        path.getClass();
                    }
                    return Boolean.valueOf(melonDSiNand.importTitleFile((int) (dSiWareTitle2.getTitleId() & 4294967295L), bb1Var.ordinal(), path));
                }
            }
            if (this.g.get()) {
            }
        } finally {
            hb4Var.h(null);
        }
        bgVar = new bg(this, s41Var);
        Object obj2 = bgVar.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = bgVar.f0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0045, B:20:0x004d, B:25:0x0055, B:27:0x006d, B:29:0x008d, B:30:0x00ab), top: B:36:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0045, B:20:0x004d, B:25:0x0055, B:27:0x006d, B:29:0x008d, B:30:0x00ab), top: B:36:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(s41 s41Var) {
        cg cgVar;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof cg) {
                cgVar = (cg) s41Var;
                int i2 = cgVar.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cgVar.Z = i2 - Integer.MIN_VALUE;
                    Object obj = cgVar.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = cgVar.Z;
                    if (i == 0) {
                        if (i == 1) {
                            hb4Var = cgVar.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.e;
                        cgVar.R = hb4Var2;
                        cgVar.Z = 1;
                        if (hb4Var2.e(cgVar) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    if (this.g.get()) {
                        return yt1.A;
                    }
                    ArrayList<DSiWareTitle> listTitles = MelonDSiNand.a.listTitles();
                    ArrayList arrayList = new ArrayList(ht0.v0(listTitles, 10));
                    int size = listTitles.size();
                    int i3 = 0;
                    while (i3 < size) {
                        DSiWareTitle dSiWareTitle = listTitles.get(i3);
                        i3++;
                        DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                        String a = this.d.a(dSiWareTitle2.getTitleId(), dSiWareTitle2.getName());
                        if (!a.equals(dSiWareTitle2.getName())) {
                            dSiWareTitle2 = new DSiWareTitle(a, dSiWareTitle2.getProducer(), dSiWareTitle2.getTitleId(), dSiWareTitle2.getIcon(), dSiWareTitle2.getPublicSavSize(), dSiWareTitle2.getPrivateSavSize(), dSiWareTitle2.getAppFlags());
                        }
                        arrayList.add(dSiWareTitle2);
                    }
                    return arrayList;
                }
            }
            if (this.g.get()) {
            }
        } finally {
            hb4Var.h(null);
        }
        cgVar = new cg(this, s41Var);
        Object obj2 = cgVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = cgVar.Z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r11.e(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:23:0x0058, B:25:0x005e, B:30:0x006a, B:32:0x0076, B:35:0x007c), top: B:61:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #1 {all -> 0x0067, blocks: (B:23:0x0058, B:25:0x005e, B:30:0x006a, B:32:0x0076, B:35:0x007c), top: B:61:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:39:0x0094, B:45:0x00a3, B:50:0x00b1, B:52:0x00b7, B:54:0x00bd, B:46:0x00a6, B:47:0x00a9, B:48:0x00ac, B:49:0x00af), top: B:59:0x002f }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [fb4] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [fb4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fb4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum i(s41 s41Var) {
        dg dgVar;
        int i;
        AtomicBoolean atomicBoolean;
        hb4 hb4Var;
        int i2;
        hb4 hb4Var2;
        MelonDSiNand melonDSiNand;
        int openNand;
        mm4 mm4Var;
        try {
            if (s41Var instanceof dg) {
                dgVar = (dg) s41Var;
                int i3 = dgVar.e0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dgVar.e0 = i3 - Integer.MIN_VALUE;
                    Object obj = dgVar.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = dgVar.e0;
                    AtomicInteger atomicInteger = this.f;
                    atomicBoolean = this.g;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                melonDSiNand = dgVar.X;
                                hb4Var2 = dgVar.R;
                                try {
                                    oi2.Y(obj);
                                    hb4Var2 = hb4Var2;
                                    openNand = melonDSiNand.openNand((EmulatorConfiguration) obj);
                                    if (openNand == 0) {
                                        if (openNand != 1) {
                                            if (openNand != 2) {
                                                if (openNand != 3) {
                                                    mm4Var = mm4.UNKNOWN;
                                                } else {
                                                    mm4Var = mm4.NAND_OPEN_FAILED;
                                                }
                                            } else {
                                                mm4Var = mm4.BIOS7_NOT_FOUND;
                                            }
                                        } else {
                                            mm4Var = mm4.NAND_ALREADY_OPEN;
                                        }
                                    } else {
                                        mm4Var = mm4.SUCCESS;
                                    }
                                    if (!mm4Var.isFailure() && atomicInteger.getAndIncrement() == 0) {
                                        atomicBoolean.set(true);
                                    }
                                    hb4Var2.h(null);
                                    return mm4Var;
                                } catch (Throwable th) {
                                    th = th;
                                    hb4Var2.h(null);
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = dgVar.Y;
                        ?? r8 = dgVar.R;
                        oi2.Y(obj);
                        hb4Var = r8;
                    } else {
                        oi2.Y(obj);
                        hb4Var = this.e;
                        dgVar.R = hb4Var;
                        i2 = 0;
                        dgVar.Y = 0;
                        dgVar.e0 = 1;
                    }
                    if (!atomicBoolean.get()) {
                        atomicInteger.incrementAndGet();
                        mm4 mm4Var2 = mm4.NAND_ALREADY_OPEN;
                        hb4Var.h(null);
                        return mm4Var2;
                    } else if (this.c.c().b != cz0.VALID) {
                        mm4 mm4Var3 = mm4.INVALID_DSI_SETUP;
                        hb4Var.h(null);
                        return mm4Var3;
                    } else {
                        MelonDSiNand melonDSiNand2 = MelonDSiNand.a;
                        kd6 kd6Var = this.b;
                        dgVar.R = hb4Var;
                        dgVar.X = melonDSiNand2;
                        dgVar.Y = i2;
                        dgVar.e0 = 2;
                        Object k = ((ng6) kd6Var).k(dgVar);
                        if (k != x61Var) {
                            hb4Var2 = hb4Var;
                            obj = k;
                            melonDSiNand = melonDSiNand2;
                            openNand = melonDSiNand.openNand((EmulatorConfiguration) obj);
                            if (openNand == 0) {
                            }
                            if (!mm4Var.isFailure()) {
                                atomicBoolean.set(true);
                            }
                            hb4Var2.h(null);
                            return mm4Var;
                        }
                        return x61Var;
                    }
                }
            }
            if (!atomicBoolean.get()) {
            }
        } catch (Throwable th2) {
            th = th2;
            hb4Var2 = hb4Var;
            hb4Var2.h(null);
            throw th;
        }
        dgVar = new dg(this, s41Var);
        Object obj2 = dgVar.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = dgVar.e0;
        AtomicInteger atomicInteger2 = this.f;
        atomicBoolean = this.g;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0045, B:20:0x004d, B:25:0x0055), top: B:30:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0045, B:20:0x004d, B:25:0x0055), top: B:30:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, s41 s41Var) {
        eg egVar;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof eg) {
                egVar = (eg) s41Var;
                int i2 = egVar.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    egVar.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = egVar.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = egVar.d0;
                    if (i == 0) {
                        if (i == 1) {
                            j = egVar.R;
                            hb4Var = egVar.X;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.e;
                        egVar.X = hb4Var2;
                        egVar.R = j;
                        egVar.d0 = 1;
                        if (hb4Var2.e(egVar) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    if (this.g.get()) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(MelonDSiNand.a.repairTitleSaves((int) (j & 4294967295L)));
                }
            }
            if (this.g.get()) {
            }
        } finally {
            hb4Var.h(null);
        }
        egVar = new eg(this, s41Var);
        Object obj2 = egVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = egVar.d0;
        if (i == 0) {
        }
    }
}
