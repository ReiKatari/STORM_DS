package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public final class ug extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
        this.c0 = obj3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 1:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 2:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 3:
                return ((ug) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((ug) t(j11Var, o31Var)).v(o27Var);
            case 5:
                return ((ug) t(j11Var, o31Var)).v(o27Var);
            case ig7.b /* 6 */:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 7:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 8:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 9:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 10:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 11:
                return ((ug) t(j11Var, o31Var)).v(o27Var);
            default:
                ((ug) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                return new ug((ak2) this.Y, (String) obj3, (RARuntimeBridgeConfig) obj2, j11Var, 0);
            case 1:
                return new ug((File) this.Y, (yg) obj3, (byte[]) obj2, j11Var, 1);
            case 2:
                return new ug((k24) this.Y, (ef1) obj3, (xa6) obj2, j11Var, 2);
            case 3:
                return new ug((hv1) this.Y, (st1) obj3, (ft5) obj2, j11Var, 3);
            case 4:
                ug ugVar = new ug((hv1) obj3, (Uri) obj2, j11Var, 4);
                ugVar.Y = obj;
                return ugVar;
            case 5:
                ug ugVar2 = new ug((vp4) obj3, (vo6) obj2, j11Var, 5);
                ugVar2.Y = obj;
                return ugVar2;
            case ig7.b /* 6 */:
                return new ug((mi2) this.Y, (rg5) obj3, (k24) obj2, j11Var, 6);
            case 7:
                return new ug((ri5) this.Y, (mi2) obj3, (qj4) obj2, j11Var, 7);
            case 8:
                return new ug((RomDetailsActivity) this.Y, (rg5) obj3, (Uri) obj2, j11Var, 8);
            case 9:
                return new ug((ya1) this.Y, (mi2) obj3, (aj2) obj2, j11Var, 9);
            case 10:
                return new ug((a) this.Y, (rg5) obj3, (Uri) obj2, j11Var, 10);
            case 11:
                ug ugVar3 = new ug((List) obj3, (yo5) obj2, j11Var, 11);
                ugVar3.Y = obj;
                return ugVar3;
            default:
                return new ug((mi2) this.Y, (n6) obj3, (k24) obj2, j11Var, 12);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        qz1 K;
        Object kc5Var;
        boolean z;
        kh5 kh5Var;
        Object kc5Var2;
        String str;
        int i = this.X;
        boolean z2 = false;
        rg5 rg5Var = null;
        o27 o27Var = o27.a;
        Object obj2 = this.Z;
        Object obj3 = this.c0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ak2 ak2Var = (ak2) this.Y;
                if (MelonEmulator.a.setupAchievements((RASimpleAchievement[]) ak2Var.b.toArray(new RASimpleAchievement[0]), (RASimpleLeaderboard[]) ak2Var.c.toArray(new RASimpleLeaderboard[0]), (String) obj2, (RARuntimeBridgeConfig) obj3)) {
                    return o27Var;
                }
                throw new RuntimeException("RetroAchievements runtime setup failed");
            case 1:
                byte[] bArr = (byte[]) obj3;
                yg ygVar = (yg) obj2;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                File file = (File) this.Y;
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    if (file.exists()) {
                        file.delete();
                    }
                    K = yg.a(ygVar, file).K();
                    try {
                        K.write(bArr);
                        K.close();
                    } finally {
                    }
                } else {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    File file2 = new File(parentFile, ".tmp");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    File file3 = new File(file2, file.getName());
                    if (file3.exists()) {
                        file3.delete();
                    }
                    K = yg.a(ygVar, file3).K();
                    try {
                        K.write(bArr);
                        K.close();
                        if (file.exists()) {
                            file.delete();
                        }
                        if (!file3.renameTo(file)) {
                            if (file3.exists()) {
                                if (file.exists() && !file.delete()) {
                                    throw new m62(file3, file, "Tried to overwrite the destination, but failed to delete it.");
                                }
                                if (file3.isDirectory()) {
                                    if (!file.mkdirs()) {
                                        throw new m62(file3, file, "Failed to create target directory.");
                                    }
                                } else {
                                    File parentFile2 = file.getParentFile();
                                    if (parentFile2 != null) {
                                        parentFile2.mkdirs();
                                    }
                                    FileInputStream fileInputStream = new FileInputStream(file3);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        pu.o(fileInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        fileInputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            dt3.W(fileInputStream, th);
                                            throw th2;
                                        }
                                    }
                                }
                                file3.delete();
                            } else {
                                throw new m62(file3, null, "The source file doesn't exist.");
                            }
                        }
                    } finally {
                    }
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ef1 ef1Var = (ef1) obj2;
                xa6 xa6Var = (xa6) obj3;
                for (l34 l34Var : (Set) ((k24) this.Y).getValue()) {
                    if (!((List) ef1Var.b().e.A.getValue()).contains(l34Var) && !xa6Var.contains(l34Var)) {
                        ef1Var.b().c(l34Var);
                    }
                }
                return o27Var;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                e72 e72Var = ((hv1) this.Y).s;
                rg5 rg5Var2 = ((st1) obj2).a;
                ft5 ft5Var = (ft5) obj3;
                e72Var.getClass();
                rg5Var2.getClass();
                ft5Var.getClass();
                if (ft5Var.b) {
                    uh1 d = e72Var.d(rg5Var2);
                    if (d != null) {
                        String a = e72Var.a(rg5Var2);
                        if (a != null) {
                            uh1 f = d.f(a + ".ml" + ft5Var.a);
                            if (f != null) {
                                f.d();
                            }
                            et5 et5Var = e72Var.b;
                            File a2 = et5Var.a(rg5Var2, ft5Var, false);
                            if (a2 != null) {
                                et5Var.c(a2);
                                a2.delete();
                            }
                        } else {
                            throw new Exception("Could not determine ROM file name");
                        }
                    } else {
                        throw new Exception("Could not create parent directory document");
                    }
                }
                return e72Var.c(rg5Var2);
            case 4:
                o31 o31Var = (o31) this.Y;
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Uri uri = (Uri) obj3;
                try {
                    ParcelFileDescriptor openFileDescriptor = ((hv1) obj2).b.getContentResolver().openFileDescriptor(uri, "r");
                    if (openFileDescriptor != null) {
                        long statSize = openFileDescriptor.getStatSize();
                        if (0 > statSize || statSize >= 12) {
                            byte[] bArr2 = new byte[12];
                            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            try {
                                int read = fileInputStream2.read(bArr2);
                                fileInputStream2.close();
                                if (read >= 12) {
                                    if (bArr2[0] == 77 && bArr2[1] == 69 && bArr2[2] == 76 && bArr2[3] == 78) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    int i2 = (bArr2[4] & 255) | ((bArr2[5] & 255) << 8);
                                    int i3 = (bArr2[6] & 255) | ((bArr2[7] & 255) << 8);
                                    long j = ((bArr2[11] & 255) << 24) | ((bArr2[9] & 255) << 8) | (bArr2[8] & 255) | ((bArr2[10] & 255) << 16);
                                    if (z && i2 == 13 && i3 <= 0 && (statSize < 0 || j == statSize)) {
                                        z2 = true;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    dt3.W(fileInputStream2, th3);
                                    throw th4;
                                }
                            }
                        }
                        openFileDescriptor.close();
                    }
                    kc5Var = Boolean.valueOf(z2);
                } catch (Throwable th5) {
                    kc5Var = new kc5(th5);
                }
                Throwable a3 = nc5.a(kc5Var);
                if (a3 != null) {
                    Log.w("AutoState", "Failed to validate savestate header for " + uri, a3);
                }
                Boolean bool = Boolean.FALSE;
                if (kc5Var instanceof kc5) {
                    return bool;
                }
                return kc5Var;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                o31 o31Var2 = (o31) this.Y;
                s31 s31Var = s31.UNDISPATCHED;
                vp4 vp4Var = (vp4) obj2;
                vo6 vo6Var = (vo6) obj3;
                tq5.w(o31Var2, null, s31Var, new r21(vp4Var, vo6Var, null, 1), 1);
                return tq5.w(o31Var2, null, s31Var, new r21(vp4Var, vo6Var, null, 2), 1);
            case ig7.b /* 6 */:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((Boolean) ((k24) obj3).getValue()).booleanValue()) {
                    ((mi2) this.Y).n((rg5) obj2);
                }
                return o27Var;
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Object N0 = tq0.N0(((qj4) obj3).h(), ((ri5) this.Y).a);
                if (N0 instanceof kh5) {
                    kh5Var = (kh5) N0;
                } else {
                    kh5Var = null;
                }
                if (kh5Var != null) {
                    rg5Var = kh5Var.a;
                }
                ((mi2) obj2).n(rg5Var);
                return o27Var;
            case 8:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var = ((RomDetailsActivity) this.Y).A0;
                if (rp5Var != null) {
                    rp5Var.b((rg5) obj2, (Uri) obj3);
                    return o27Var;
                }
                b53.g0("romSaveFileManager");
                throw null;
            case 9:
                p31 p31Var10 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ya1 ya1Var = (ya1) this.Y;
                if (ya1Var.k() != gl5.RETRO_ACHIEVEMENTS.getTabIndex()) {
                    ((mi2) obj2).n(null);
                }
                if (ya1Var.k() != gl5.CONFIG.getTabIndex()) {
                    ((aj2) obj3).j(null, null);
                }
                return o27Var;
            case 10:
                p31 p31Var11 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                rp5 rp5Var2 = ((a) this.Y).Y;
                if (rp5Var2 != null) {
                    rp5Var2.b((rg5) obj2, (Uri) obj3);
                    return o27Var;
                }
                b53.g0("romSaveFileManager");
                throw null;
            case 11:
                o31 o31Var3 = (o31) this.Y;
                p31 p31Var12 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                List<rg5> list = (List) obj2;
                yo5 yo5Var = (yo5) obj3;
                ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
                for (rg5 rg5Var3 : list) {
                    Uri uri2 = rg5Var3.e;
                    if (uri2 != null) {
                        try {
                            kc5Var2 = DocumentsContract.getDocumentId(uri2);
                        } catch (Throwable th6) {
                            kc5Var2 = new kc5(th6);
                        }
                        if (kc5Var2 instanceof kc5) {
                            kc5Var2 = null;
                        }
                        str = (String) kc5Var2;
                    } else {
                        str = null;
                    }
                    arrayList.add(yo5.e(yo5Var, rg5Var3, str));
                }
                return arrayList;
            default:
                p31 p31Var13 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (((Boolean) ((k24) obj3).getValue()).booleanValue()) {
                    ((mi2) this.Y).n((n6) obj2);
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
    }
}
