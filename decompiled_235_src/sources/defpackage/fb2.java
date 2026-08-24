package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb2  reason: default package */
/* loaded from: classes.dex */
public final class fb2 {
    public final kd6 a;
    public final Context b;

    public fb2(Context context, kd6 kd6Var) {
        this.a = kd6Var;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dz0 a(ConsoleType consoleType, Uri uri) {
        Map m0;
        Object em5Var;
        Object em5Var2;
        cz0 cz0Var;
        int i = eb2.a[consoleType.ordinal()];
        Object obj = null;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                m0 = c14.m0(new vr4("bios7.bin", new a0(1, this, fb2.class, "getDSiBios7Status", "getDSiBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 11)), new vr4("bios9.bin", new a0(1, this, fb2.class, "getDSiBios9Status", "getDSiBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 12)), new vr4("firmware.bin", new a0(1, this, fb2.class, "getDSiFirmwareStatus", "getDSiFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 13)), new vr4("nand.bin", new a0(1, this, fb2.class, "getDSiNandStatus", "getDSiNandStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 14)));
            } else {
                i.d();
                return null;
            }
        } else {
            m0 = c14.m0(new vr4("bios7.bin", new a0(1, this, fb2.class, "getDSBios7Status", "getDSBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 8)), new vr4("bios9.bin", new a0(1, this, fb2.class, "getDSBios9Status", "getDSBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 9)), new vr4("firmware.bin", new a0(1, this, fb2.class, "getDSFirmwareStatus", "getDSFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 10)));
        }
        if (uri == null) {
            ArrayList arrayList = new ArrayList(m0.size());
            for (Map.Entry entry : m0.entrySet()) {
                arrayList.add(new vr4(entry.getKey(), bz0.MISSING));
            }
            return new dz0(consoleType, cz0.UNSET, (String[]) m0.keySet().toArray(new String[0]), (vr4[]) arrayList.toArray(new vr4[0]));
        }
        try {
            if (nb3.k(uri.getScheme(), "file")) {
                String path = uri.getPath();
                if (path != null) {
                    File file = new File(path);
                    if (file.exists() && file.isDirectory()) {
                        em5Var = new vd5(file);
                    }
                }
                em5Var = null;
            } else {
                em5Var = zl1.h(this.b, uri);
            }
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        zl1 zl1Var = (zl1) obj;
        if (zl1Var != null) {
            try {
            } catch (Throwable th2) {
                em5Var2 = new em5(th2);
            }
            if (zl1Var.k()) {
                em5Var2 = Boolean.valueOf(z);
                Object obj2 = Boolean.FALSE;
                if (em5Var2 instanceof em5) {
                    em5Var2 = obj2;
                }
                if (((Boolean) em5Var2).booleanValue()) {
                    ArrayList arrayList2 = new ArrayList(m0.size());
                    for (Map.Entry entry2 : m0.entrySet()) {
                        arrayList2.add(new vr4(entry2.getKey(), bz0.MISSING));
                    }
                    return new dz0(consoleType, cz0.INVALID, (String[]) m0.keySet().toArray(new String[0]), (vr4[]) arrayList2.toArray(new vr4[0]));
                } else if (zl1Var == null) {
                    ArrayList arrayList3 = new ArrayList(m0.size());
                    for (Map.Entry entry3 : m0.entrySet()) {
                        arrayList3.add(new vr4(entry3.getKey(), bz0.MISSING));
                    }
                    return new dz0(consoleType, cz0.INVALID, (String[]) m0.keySet().toArray(new String[0]), (vr4[]) arrayList3.toArray(new vr4[0]));
                } else {
                    ArrayList arrayList4 = new ArrayList(m0.size());
                    for (Map.Entry entry4 : m0.entrySet()) {
                        arrayList4.add(new vr4(entry4.getKey(), ((qn2) entry4.getValue()).g(zl1Var)));
                    }
                    if (!arrayList4.isEmpty()) {
                        int size = arrayList4.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList4.get(i2);
                            i2++;
                            if (((vr4) obj3).B != bz0.PRESENT) {
                                cz0Var = cz0.INVALID;
                                break;
                            }
                        }
                    }
                    cz0Var = cz0.VALID;
                    return new dz0(consoleType, cz0Var, (String[]) m0.keySet().toArray(new String[0]), (vr4[]) arrayList4.toArray(new vr4[0]));
                }
            }
        }
        z = false;
        em5Var2 = Boolean.valueOf(z);
        Object obj22 = Boolean.FALSE;
        if (em5Var2 instanceof em5) {
        }
        if (((Boolean) em5Var2).booleanValue()) {
        }
    }

    public final dz0 b(ConsoleType consoleType) {
        String str;
        consoleType.getClass();
        int i = ez0.a[consoleType.ordinal()];
        Uri uri = null;
        if (i != 1) {
            if (i == 2) {
                return c();
            }
            i.d();
            return null;
        }
        Set<String> stringSet = ((ng6) this.a).b.getStringSet("bios_dir", null);
        if (stringSet != null) {
            str = (String) gt0.I0(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        }
        return a(ConsoleType.DS, uri);
    }

    public final dz0 c() {
        String str;
        Uri uri;
        String str2;
        kd6 kd6Var = this.a;
        Uri uri2 = null;
        Set<String> stringSet = ((ng6) kd6Var).b.getStringSet("dsi_bios_dir", null);
        if (stringSet != null) {
            str = (String) gt0.I0(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        dz0 a = a(ConsoleType.DSi, uri);
        if (a.b != cz0.VALID) {
            return a;
        }
        Set<String> stringSet2 = ((ng6) kd6Var).b.getStringSet("bios_dir", null);
        if (stringSet2 != null) {
            str2 = (String) gt0.I0(stringSet2);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            uri2 = Uri.parse(str2);
        }
        return a(ConsoleType.DS, uri2);
    }

    public final bz0 d(zl1 zl1Var, String str, long j) {
        Object em5Var;
        long j2;
        zl1 f = zl1Var.f(str);
        if (f == null) {
            return bz0.MISSING;
        }
        try {
            if (nb3.k(f.j().getScheme(), "file")) {
                String path = f.j().getPath();
                if (path == null) {
                    path = "";
                }
                j2 = new File(path).length();
            } else {
                AssetFileDescriptor openAssetFileDescriptor = this.b.getContentResolver().openAssetFileDescriptor(f.j(), "r");
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    openAssetFileDescriptor.close();
                    j2 = length;
                } else {
                    j2 = -1;
                }
            }
            if (j2 == -1) {
                em5Var = bz0.MISSING;
            } else if (j2 == j) {
                em5Var = bz0.PRESENT;
            } else {
                em5Var = bz0.INVALID;
            }
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = bz0.MISSING;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return (bz0) em5Var;
    }
}
