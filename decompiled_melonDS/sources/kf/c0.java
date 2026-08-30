package kf;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final cf.d f8172a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8173b;

    public c0(Context context, cf.d dVar) {
        this.f8172a = dVar;
        this.f8173b = context;
    }

    public final oe.i a(ConsoleType consoleType, Uri uri) {
        Map F;
        oe.h hVar;
        int i2 = b0.f8141a[consoleType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                F = zb.v.F(new yb.j("bios7.bin", new a2.g(1, this, c0.class, "getDSiBios7Status", "getDSiBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 11)), new yb.j("bios9.bin", new a2.g(1, this, c0.class, "getDSiBios9Status", "getDSiBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 12)), new yb.j("firmware.bin", new a2.g(1, this, c0.class, "getDSiFirmwareStatus", "getDSiFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 13)), new yb.j("nand.bin", new a2.g(1, this, c0.class, "getDSiNandStatus", "getDSiNandStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 14)));
            } else {
                m9.o.o();
                return null;
            }
        } else {
            F = zb.v.F(new yb.j("bios7.bin", new a2.g(1, this, c0.class, "getDSBios7Status", "getDSBios7Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 8)), new yb.j("bios9.bin", new a2.g(1, this, c0.class, "getDSBios9Status", "getDSBios9Status(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 9)), new yb.j("firmware.bin", new a2.g(1, this, c0.class, "getDSFirmwareStatus", "getDSFirmwareStatus(Landroidx/documentfile/provider/DocumentFile;)Lme/magnum/melonds/domain/model/ConfigurationDirResult$FileStatus;", 0, 0, 10)));
        }
        if (uri == null) {
            ArrayList arrayList = new ArrayList(F.size());
            for (Map.Entry entry : F.entrySet()) {
                arrayList.add(new yb.j(entry.getKey(), oe.g.MISSING));
            }
            return new oe.i(consoleType, oe.h.UNSET, (String[]) F.keySet().toArray(new String[0]), (yb.j[]) arrayList.toArray(new yb.j[0]));
        }
        k6.c e6 = k6.a.e(this.f8173b, uri);
        if (e6.h()) {
            ArrayList arrayList2 = new ArrayList(F.size());
            for (Map.Entry entry2 : F.entrySet()) {
                arrayList2.add(new yb.j(entry2.getKey(), ((mc.l) entry2.getValue()).k(e6)));
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    if (((yb.j) obj).B != oe.g.PRESENT) {
                        hVar = oe.h.INVALID;
                        break;
                    }
                }
            }
            hVar = oe.h.VALID;
            return new oe.i(consoleType, hVar, (String[]) F.keySet().toArray(new String[0]), (yb.j[]) arrayList2.toArray(new yb.j[0]));
        }
        ArrayList arrayList3 = new ArrayList(F.size());
        for (Map.Entry entry3 : F.entrySet()) {
            arrayList3.add(new yb.j(entry3.getKey(), oe.g.MISSING));
        }
        return new oe.i(consoleType, oe.h.INVALID, (String[]) F.keySet().toArray(new String[0]), (yb.j[]) arrayList3.toArray(new yb.j[0]));
    }

    public final oe.i b(ConsoleType consoleType) {
        String str;
        consoleType.getClass();
        int i2 = df.a.f4052a[consoleType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return c();
            }
            m9.o.o();
            return null;
        }
        Uri uri = null;
        Set<String> stringSet = ((d2) this.f8172a).f8181b.getStringSet("bios_dir", null);
        if (stringSet != null) {
            str = (String) zb.l.S(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        }
        return a(ConsoleType.DS, uri);
    }

    public final oe.i c() {
        String str;
        Uri uri;
        String str2;
        cf.d dVar = this.f8172a;
        Uri uri2 = null;
        Set<String> stringSet = ((d2) dVar).f8181b.getStringSet("dsi_bios_dir", null);
        if (stringSet != null) {
            str = (String) zb.l.S(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        oe.i a10 = a(ConsoleType.DSi, uri);
        if (a10.f10937b != oe.h.VALID) {
            return a10;
        }
        Set<String> stringSet2 = ((d2) dVar).f8181b.getStringSet("bios_dir", null);
        if (stringSet2 != null) {
            str2 = (String) zb.l.S(stringSet2);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            uri2 = Uri.parse(str2);
        }
        return a(ConsoleType.DS, uri2);
    }

    public final oe.g d(k6.a aVar, String str, long j2) {
        oe.g gVar;
        k6.a c4 = aVar.c(str);
        if (c4 == null) {
            return oe.g.MISSING;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = this.f8173b.getContentResolver().openAssetFileDescriptor(c4.g(), "r");
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                if (length == -1) {
                    gVar = oe.g.MISSING;
                } else if (length == j2) {
                    gVar = oe.g.PRESENT;
                } else {
                    gVar = oe.g.INVALID;
                }
                openAssetFileDescriptor.close();
                if (gVar != null) {
                    return gVar;
                }
            }
            return oe.g.MISSING;
        } catch (FileNotFoundException unused) {
            return oe.g.MISSING;
        }
    }
}
