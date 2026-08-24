package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.util.Log;
import android.widget.Toast;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.MelonDSiNand;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public final class ag extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
        this.d0 = obj3;
    }

    private final Object v(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        ue1 ue1Var = (ue1) this.Y;
        if (ue1Var.k() != vv5.RETRO_ACHIEVEMENTS.getTabIndex()) {
            ((qn2) this.Z).g(null);
        }
        if (ue1Var.k() != vv5.CONFIG.getTabIndex()) {
            ((eo2) this.d0).o(null, null);
        }
        return jg7.a;
    }

    private final Object x(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        l06 l06Var = ((a) this.Y).Y;
        if (l06Var != null) {
            l06Var.b((pq5) this.Z, (Uri) this.d0);
            return jg7.a;
        }
        nb3.a0("romSaveFileManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [em5] */
    private final Object z(Object obj) {
        Object em5Var;
        String em5Var2;
        w61 w61Var = (w61) this.Y;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        List<pq5> list = (List) this.Z;
        tz5 tz5Var = (tz5) this.d0;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        for (pq5 pq5Var : list) {
            Uri uri = pq5Var.e;
            String str = null;
            if (uri != null) {
                try {
                    em5Var = DocumentsContract.getDocumentId(uri);
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (em5Var instanceof em5) {
                    em5Var = null;
                }
                String str2 = (String) em5Var;
                if (str2 == null) {
                    try {
                        em5Var2 = DocumentsContract.getTreeDocumentId(uri);
                    } catch (Throwable th2) {
                        em5Var2 = new em5(th2);
                    }
                    if (!(em5Var2 instanceof em5)) {
                        str = em5Var2;
                    }
                    str = str;
                    if (str == null) {
                        str = uri.getLastPathSegment();
                    }
                } else {
                    str = str2;
                }
            }
            arrayList.add(tz5.e(tz5Var, pq5Var, str));
        }
        return arrayList;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 2:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 3:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 4:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 6:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 7:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 8:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 9:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 10:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            case 11:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 12:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 13:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 14:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            case 15:
                return ((ag) q(r41Var, w61Var)).s(jg7Var);
            default:
                ((ag) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                ag agVar = new ag((fg) obj3, (Uri) obj2, r41Var, 0);
                agVar.Y = obj;
                return agVar;
            case 1:
                return new ag((ep2) this.Y, (String) obj3, (RARuntimeBridgeConfig) obj2, r41Var, 1);
            case 2:
                return new ag((File) this.Y, (kh) obj3, (byte[]) obj2, r41Var, 2);
            case 3:
                return new ag((m20) this.Y, (fk3) obj3, (zn3) obj2, r41Var, 3);
            case 4:
                return new ag((eb) this.Y, (String) obj3, (String) obj2, r41Var, 4);
            case 5:
                return new ag((qa4) this.Y, (ij1) obj3, (mm6) obj2, r41Var, 5);
            case 6:
                return new ag((sz1) this.Y, (dy1) obj3, (c46) obj2, r41Var, 6);
            case 7:
                ag agVar2 = new ag((sz1) obj3, (Uri) obj2, r41Var, 7);
                agVar2.Y = obj;
                return agVar2;
            case 8:
                return new ag((Context) this.Y, (String) obj3, (qa4) obj2, r41Var, 8);
            case 9:
                ag agVar3 = new ag((zy4) obj3, (g17) obj2, r41Var, 9);
                agVar3.Y = obj;
                return agVar3;
            case 10:
                return new ag((String) this.Y, (ng0) obj3, (String) obj2, r41Var, 10);
            case 11:
                return new ag((ss5) this.Y, (qn2) obj3, (ss4) obj2, r41Var, 11);
            case 12:
                return new ag((RomDetailsActivity) this.Y, (pq5) obj3, (Uri) obj2, r41Var, 12);
            case 13:
                return new ag((ue1) this.Y, (qn2) obj3, (eo2) obj2, r41Var, 13);
            case 14:
                return new ag((a) this.Y, (pq5) obj3, (Uri) obj2, r41Var, 14);
            case 15:
                ag agVar4 = new ag((List) obj3, (tz5) obj2, r41Var, 15);
                agVar4.Y = obj;
                return agVar4;
            default:
                return new ag((qn2) this.Y, (o6) obj3, (qa4) obj2, r41Var, 16);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:354|355|(3:357|(4:362|363|(1:370)(1:367)|368)(1:359)|(1:361))|379|(1:381)|382|(2:384|(16:386|387|(1:392)|393|394|395|396|397|398|(1:400)(1:431)|401|402|(1:404)|405|(1:429)(1:409)|(1:414)))|438|387|(2:389|392)|393|394|395|396|397|398|(0)(0)|401|402|(0)|405|(1:407)|429|(2:411|414)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x028e, code lost:
        if (r8 == r21) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x096c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0974, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0975, code lost:
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0977, code lost:
        r0 = new defpackage.em5(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0991, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x09a9, code lost:
        r6.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x09ac, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05fb A[Catch: all -> 0x0637, TRY_ENTER, TryCatch #16 {all -> 0x0637, blocks: (B:251:0x05d9, B:262:0x05fb, B:264:0x0613, B:270:0x064b, B:274:0x0678, B:278:0x06a7, B:282:0x06d9, B:284:0x06e2, B:287:0x06ea, B:289:0x06f0, B:291:0x06f6, B:293:0x0700, B:295:0x0706, B:297:0x0710, B:328:0x0786, B:329:0x078d), top: B:487:0x05d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0786 A[Catch: all -> 0x0637, TRY_ENTER, TryCatch #16 {all -> 0x0637, blocks: (B:251:0x05d9, B:262:0x05fb, B:264:0x0613, B:270:0x064b, B:274:0x0678, B:278:0x06a7, B:282:0x06d9, B:284:0x06e2, B:287:0x06ea, B:289:0x06f0, B:291:0x06f6, B:293:0x0700, B:295:0x0706, B:297:0x0710, B:328:0x0786, B:329:0x078d), top: B:487:0x05d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0961 A[Catch: all -> 0x0964, TRY_LEAVE, TryCatch #8 {all -> 0x096c, blocks: (B:428:0x0958, B:436:0x0968, B:429:0x095b, B:431:0x0961), top: B:474:0x0958 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0987 A[Catch: all -> 0x0991, TryCatch #27 {all -> 0x0991, blocks: (B:447:0x097d, B:450:0x0983, B:452:0x0987, B:459:0x0995, B:462:0x099c, B:446:0x0977), top: B:506:0x0977 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0995 A[Catch: all -> 0x0991, TryCatch #27 {all -> 0x0991, blocks: (B:447:0x097d, B:450:0x0983, B:452:0x0987, B:459:0x0995, B:462:0x099c, B:446:0x0977), top: B:506:0x0977 }] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        short s;
        byte[] bArr2;
        short s2;
        int i5;
        int i6;
        long j;
        int i7;
        Object obj2;
        int i8;
        File file;
        t33 t33Var;
        String str;
        boolean z;
        String str2;
        String str3;
        uz5 K;
        Object obj3;
        int columnIndex;
        InputStream openInputStream;
        Throwable th;
        byte[] bArr3;
        int i9;
        Throwable th2;
        int i10;
        byte[] bArr4;
        int i11;
        char c;
        int i12;
        char c2;
        int i13;
        int i14;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        MessageDigest messageDigest;
        long j2;
        byte[] bArr5;
        long j3;
        int read;
        yl5 yl5Var;
        String r;
        String optString;
        JSONObject optJSONObject;
        Object em5Var;
        boolean z2;
        List<String> list;
        String str4;
        mr5 mr5Var;
        int i15 = this.X;
        boolean z3 = true;
        JSONObject jSONObject = null;
        pq5 pq5Var = null;
        jSONObject = null;
        boolean z4 = false;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.Z;
        long j4 = 0;
        Object obj5 = this.d0;
        switch (i15) {
            case 0:
                MelonDSiNand melonDSiNand = MelonDSiNand.a;
                Uri uri = (Uri) obj5;
                w61 w61Var = (w61) this.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                fg fgVar = (fg) obj4;
                db1 db1Var = fgVar.d;
                Context context = fgVar.a;
                if (!fgVar.g.get()) {
                    return t33.NAND_NOT_OPEN;
                }
                File file2 = new File(context.getCacheDir(), lb1.i(System.currentTimeMillis(), "dsiware_import_", ".nds"));
                try {
                    openInputStream = context.getContentResolver().openInputStream(uri);
                } catch (Throwable th3) {
                    th = th3;
                    bArr = null;
                    i = 0;
                    i2 = 196612;
                    i3 = 0;
                    i4 = 0;
                    s = 0;
                }
                if (openInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            bArr4 = new byte[576];
                            i11 = 0;
                        } catch (Throwable th4) {
                            th2 = th4;
                            i10 = 0;
                            i2 = 196612;
                            i3 = 0;
                            i4 = 0;
                            s = 0;
                        }
                        for (int i16 = 576; i11 < i16; i16 = 576) {
                            try {
                                read = openInputStream.read(bArr4, i11, 576 - i11);
                            } catch (Throwable th5) {
                                i10 = 0;
                                i3 = 0;
                                i4 = 0;
                                s = 0;
                                i2 = 196612;
                                th2 = th5;
                            }
                            if (read > 0) {
                                i11 += read;
                            } else if (i11 < 352) {
                                fileOutputStream.write(bArr4, 0, i11);
                                Charset charset = StandardCharsets.US_ASCII;
                                charset.getClass();
                                String str5 = new String(bArr4, 12, 4, charset);
                                short s3 = (short) (bArr4[30] & 255);
                                if (i11 >= 564) {
                                    c = 564;
                                    i12 = ((bArr4[561] & 255) << 8) | (bArr4[560] & 255) | ((bArr4[562] & 255) << 16) | ((bArr4[563] & 255) << 24);
                                } else {
                                    c = 564;
                                    i12 = 0;
                                }
                                if (i11 >= 568) {
                                    c2 = 568;
                                    i9 = i12;
                                    i13 = ((bArr4[565] & 255) << 8) | (bArr4[c] & 255) | ((bArr4[566] & 255) << 16) | ((bArr4[567] & 255) << 24);
                                } else {
                                    i9 = i12;
                                    c2 = 568;
                                    i13 = 0;
                                }
                                if (i11 >= 572) {
                                    c3 = 572;
                                    i14 = i13;
                                    i3 = ((bArr4[569] & 255) << 8) | (bArr4[c2] & 255) | ((bArr4[570] & 255) << 16) | ((bArr4[571] & 255) << 24);
                                } else {
                                    i14 = i13;
                                    c3 = 572;
                                    i3 = 0;
                                }
                                if (i11 >= 576) {
                                    i4 = (bArr4[c3] & 255) | ((bArr4[573] & 255) << 8) | ((bArr4[574] & 255) << 16) | ((bArr4[575] & 255) << 24);
                                } else {
                                    i4 = 0;
                                }
                                if (i9 != 0) {
                                    s = s3;
                                } else {
                                    s = s3;
                                    Character p0 = qs6.p0(0, str5);
                                    if (p0 != null) {
                                        c4 = p0.charValue();
                                    } else {
                                        c4 = 0;
                                    }
                                    Character p02 = qs6.p0(1, str5);
                                    if (p02 != null) {
                                        c5 = p02.charValue();
                                    } else {
                                        c5 = 0;
                                    }
                                    int i17 = (c5 << '\b') | c4;
                                    Character p03 = qs6.p0(2, str5);
                                    if (p03 != null) {
                                        c6 = p03.charValue();
                                    } else {
                                        c6 = 0;
                                    }
                                    int i18 = i17 | (c6 << 16);
                                    Character p04 = qs6.p0(3, str5);
                                    if (p04 != null) {
                                        c7 = p04.charValue();
                                    } else {
                                        c7 = 0;
                                    }
                                    i9 = i18 | (c7 << 24);
                                }
                                if (i14 == 0) {
                                    i14 = 196612;
                                }
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-1");
                                    messageDigest.update(bArr4, 0, i11);
                                    j2 = i11;
                                    try {
                                        bArr5 = new byte[65536];
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        j4 = j2;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                                while (true) {
                                    try {
                                        int read2 = openInputStream.read(bArr5);
                                        if (read2 > 0) {
                                            j3 = j2;
                                            try {
                                                messageDigest.update(bArr5, 0, read2);
                                                fileOutputStream.write(bArr5, 0, read2);
                                                j2 = j3 + read2;
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } else {
                                            j3 = j2;
                                            bArr = messageDigest.digest();
                                            try {
                                                fileOutputStream.close();
                                                try {
                                                    openInputStream.close();
                                                    bArr2 = bArr;
                                                    obj2 = jg7Var;
                                                    j = j3;
                                                    i7 = i9;
                                                    i8 = i14;
                                                    i5 = i4;
                                                    s2 = s;
                                                    i6 = i3;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    j4 = j3;
                                                    i = i9;
                                                    i2 = i14;
                                                    l61 l61Var = this.B;
                                                    l61Var.getClass();
                                                    yh2.o(l61Var);
                                                    obj2 = new em5(th);
                                                    bArr2 = bArr;
                                                    i7 = i;
                                                    i8 = i2;
                                                    j = j4;
                                                    i6 = i3;
                                                    i5 = i4;
                                                    s2 = s;
                                                    if (obj2 instanceof em5) {
                                                    }
                                                }
                                                if (obj2 instanceof em5) {
                                                    Log.w("DSiNandManager", xg6.n(uri, "DSiWareImport: failed to read selected title id uri="), hm5.a(obj2));
                                                    try {
                                                        file2.delete();
                                                    } catch (Throwable unused) {
                                                    }
                                                    return t33.ERROR_OPENING_FILE;
                                                }
                                                StringBuilder u = i61.u("DSiWareImport: selected category=", fg.a(fgVar, i8), " title=", fg.a(fgVar, i7), " size=");
                                                u.append(j);
                                                u.append(" uri=");
                                                u.append(uri);
                                                Log.i("DSiNandManager", u.toString());
                                                try {
                                                    ArrayList<DSiWareTitle> listTitles = melonDSiNand.listTitles();
                                                    if (listTitles == null || !listTitles.isEmpty()) {
                                                        int size = listTitles.size();
                                                        int i19 = 0;
                                                        while (i19 < size) {
                                                            DSiWareTitle dSiWareTitle = listTitles.get(i19);
                                                            i19++;
                                                            long j5 = j;
                                                            if (((int) dSiWareTitle.getTitleId()) == i7) {
                                                                Log.w("DSiNandManager", "DSiWareImport: title already imported category=" + fg.a(fgVar, i8) + " title=" + fg.a(fgVar, i7));
                                                                t33 t33Var2 = t33.TITLE_ALREADY_IMPORTED;
                                                                try {
                                                                    file2.delete();
                                                                    return t33Var2;
                                                                } catch (Throwable unused2) {
                                                                    return t33Var2;
                                                                }
                                                            }
                                                            j = j5;
                                                        }
                                                    }
                                                    int i20 = i8;
                                                    int i21 = i7;
                                                    byte[] r2 = mp2.r(i20, i21, i6, i5, s2, j, bArr2);
                                                    String absolutePath = file2.getAbsolutePath();
                                                    absolutePath.getClass();
                                                    switch (melonDSiNand.importTitle(absolutePath, r2)) {
                                                        case 0:
                                                            t33Var = t33.SUCCESS;
                                                            break;
                                                        case 1:
                                                            t33Var = t33.NAND_NOT_OPEN;
                                                            break;
                                                        case 2:
                                                            t33Var = t33.ERROR_OPENING_FILE;
                                                            break;
                                                        case 3:
                                                            t33Var = t33.NOT_DSIWARE_TITLE;
                                                            break;
                                                        case 4:
                                                            t33Var = t33.TITLE_ALREADY_IMPORTED;
                                                            break;
                                                        case 5:
                                                            t33Var = t33.INSATLL_FAILED;
                                                            break;
                                                        case 6:
                                                            t33Var = t33.TITLE_LIMIT_REACHED;
                                                            break;
                                                        case 7:
                                                            t33Var = t33.DSI_MEMORY_FULL;
                                                            break;
                                                        default:
                                                            t33Var = t33.UNKNOWN;
                                                            break;
                                                    }
                                                    t33 t33Var3 = t33Var;
                                                    Log.i("DSiNandManager", "DSiWareImport: native result=" + t33Var3 + " category=" + fg.a(fgVar, i20) + " title=" + fg.a(fgVar, i21));
                                                    if (t33Var3 == t33.SUCCESS) {
                                                        Uri uri2 = (Uri) obj5;
                                                        String i22 = zl1.g(context, uri2).i();
                                                        if (i22 == null) {
                                                            Cursor query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                                                            if (query != null) {
                                                                try {
                                                                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) != -1) {
                                                                        i22 = query.getString(columnIndex);
                                                                    } else {
                                                                        i22 = null;
                                                                    }
                                                                    query.close();
                                                                } catch (Throwable th10) {
                                                                    try {
                                                                        throw th10;
                                                                    } catch (Throwable th11) {
                                                                        ge7.t(query, th10);
                                                                        throw th11;
                                                                    }
                                                                }
                                                            } else {
                                                                i22 = null;
                                                            }
                                                            if (i22 == null) {
                                                                i22 = uri2.getLastPathSegment();
                                                            }
                                                        }
                                                        if (i22 instanceof em5) {
                                                            i22 = null;
                                                        }
                                                        String str6 = i22;
                                                        if (str6 != null) {
                                                            str = qs6.R0('.', str6, str6);
                                                            if (!qs6.v0(str)) {
                                                                if (str != null && !qs6.v0(str)) {
                                                                    db1Var.d(i21 & 4294967295L, str);
                                                                }
                                                                file = file2;
                                                                FileInputStream fileInputStream = new FileInputStream(file);
                                                                K = kn2.K(fileInputStream);
                                                                if (K == null) {
                                                                    obj3 = K.d;
                                                                } else {
                                                                    obj3 = null;
                                                                }
                                                                fileInputStream.close();
                                                                Object em5Var2 = obj3;
                                                                z = em5Var2 instanceof em5;
                                                                Object obj6 = em5Var2;
                                                                if (z) {
                                                                    obj6 = null;
                                                                }
                                                                str2 = (String) obj6;
                                                                if (str2 == null && !qs6.v0(str2)) {
                                                                    str3 = str2;
                                                                } else {
                                                                    str3 = null;
                                                                }
                                                                if (str3 != null && !qs6.v0(str3)) {
                                                                    db1Var.e(4294967295L & i21, str3);
                                                                }
                                                            }
                                                        }
                                                        str = null;
                                                        if (str != null) {
                                                            db1Var.d(i21 & 4294967295L, str);
                                                        }
                                                        file = file2;
                                                        FileInputStream fileInputStream2 = new FileInputStream(file);
                                                        K = kn2.K(fileInputStream2);
                                                        if (K == null) {
                                                        }
                                                        fileInputStream2.close();
                                                        Object em5Var22 = obj3;
                                                        z = em5Var22 instanceof em5;
                                                        Object obj62 = em5Var22;
                                                        if (z) {
                                                        }
                                                        str2 = (String) obj62;
                                                        if (str2 == null) {
                                                        }
                                                        str3 = null;
                                                        if (str3 != null) {
                                                            db1Var.e(4294967295L & i21, str3);
                                                        }
                                                    } else {
                                                        file = file2;
                                                    }
                                                    try {
                                                        file.delete();
                                                    } catch (Throwable unused3) {
                                                    }
                                                    return t33Var3;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    file = file2;
                                                    break;
                                                }
                                            } catch (Throwable th13) {
                                                bArr3 = bArr;
                                                j4 = j3;
                                                i2 = i14;
                                                th = th13;
                                                try {
                                                    throw th;
                                                } catch (Throwable th14) {
                                                    try {
                                                        ge7.t(openInputStream, th);
                                                        throw th14;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        bArr = bArr3;
                                                        i = i9;
                                                        l61 l61Var2 = this.B;
                                                        l61Var2.getClass();
                                                        yh2.o(l61Var2);
                                                        obj2 = new em5(th);
                                                        bArr2 = bArr;
                                                        i7 = i;
                                                        i8 = i2;
                                                        j = j4;
                                                        i6 = i3;
                                                        i5 = i4;
                                                        s2 = s;
                                                        if (obj2 instanceof em5) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        th = th8;
                                    } catch (Throwable th16) {
                                        th = th16;
                                        j3 = j2;
                                    }
                                    th2 = th;
                                    j4 = j3;
                                    i10 = i9;
                                    i2 = i14;
                                    try {
                                        throw th2;
                                    } catch (Throwable th17) {
                                        try {
                                            ge7.t(fileOutputStream, th2);
                                            throw th17;
                                        } catch (Throwable th18) {
                                            th = th18;
                                            i9 = i10;
                                            bArr3 = null;
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                throw new EOFException("Unable to read selected title header (too small)");
                            }
                        }
                        if (i11 < 352) {
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        bArr3 = null;
                        i2 = 196612;
                        i3 = 0;
                        i4 = 0;
                        s = 0;
                        i9 = 0;
                    }
                } else {
                    throw new EOFException("Unable to open selected title");
                }
                break;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ep2 ep2Var = (ep2) this.Y;
                if (MelonEmulator.a.setupAchievements((RASimpleAchievement[]) ep2Var.b.toArray(new RASimpleAchievement[0]), (RASimpleLeaderboard[]) ep2Var.c.toArray(new RASimpleLeaderboard[0]), (String) obj4, (RARuntimeBridgeConfig) obj5)) {
                    return jg7Var;
                }
                throw new RuntimeException("RetroAchievements runtime setup failed");
            case 2:
                byte[] bArr6 = (byte[]) obj5;
                kh khVar = (kh) obj4;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                File file3 = (File) this.Y;
                File parentFile = file3.getParentFile();
                if (parentFile == null) {
                    if (file3.exists()) {
                        file3.delete();
                    }
                    f42 J = kh.a(khVar, file3).J();
                    try {
                        J.write(bArr6);
                        J.close();
                    } finally {
                    }
                } else {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    File file4 = new File(parentFile, ".tmp");
                    if (!file4.exists()) {
                        file4.mkdirs();
                    }
                    File file5 = new File(file4, file3.getName());
                    if (file5.exists()) {
                        file5.delete();
                    }
                    f42 J2 = kh.a(khVar, file5).J();
                    try {
                        J2.write(bArr6);
                        J2.close();
                        if (file3.exists()) {
                            file3.delete();
                        }
                        if (!file5.renameTo(file3)) {
                            jc2.w0(file5, file3);
                            file5.delete();
                        }
                    } finally {
                    }
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ((m20) this.Y).g(((fk3) obj4).a);
                ((zn3) obj5).g(Boolean.TRUE);
                return jg7Var;
            case 4:
                String str7 = (String) obj4;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                eb ebVar = (eb) this.Y;
                String obj7 = qs6.T0((String) ((xp2) ebVar.L).c()).toString();
                if (obj7.length() != 0 && !qs6.v0(str7)) {
                    CharSequence charSequence = (CharSequence) ((xp2) ebVar.R).c();
                    boolean v0 = qs6.v0(charSequence);
                    String str8 = charSequence;
                    if (v0) {
                        str8 = "https://api.openai.com/v1/chat/completions";
                    }
                    String str9 = (String) str8;
                    CharSequence charSequence2 = (CharSequence) ((xp2) ebVar.X).c();
                    boolean v02 = qs6.v0(charSequence2);
                    Object obj8 = charSequence2;
                    if (v02) {
                        obj8 = "gpt-4o-mini";
                    }
                    String A = lb1.A("You are a professional video game localization expert. Translate the provided in-game dialogue/UI text accurately into natural, immersive ", (String) obj5, ". Output ONLY the translated text without notes or quotes.");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("model", (String) obj8);
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("role", "system");
                    jSONObject3.put("content", A);
                    jSONArray.put(jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("role", "user");
                    jSONObject4.put("content", str7);
                    jSONArray.put(jSONObject4);
                    jSONObject2.put("messages", jSONArray);
                    jSONObject2.put("temperature", 0.3d);
                    int i23 = mk5.a;
                    String jSONObject5 = jSONObject2.toString();
                    jSONObject5.getClass();
                    xh5 xh5Var = n34.d;
                    lk5 q = jx2.q(jSONObject5, xk2.k("application/json"));
                    s9 s9Var = new s9(13);
                    s9Var.I(str9);
                    s9Var.B("Authorization", "Bearer ".concat(obj7));
                    s9Var.D("POST", q);
                    pa paVar = new pa(s9Var);
                    xk4 xk4Var = (xk4) ebVar.B;
                    xk4Var.getClass();
                    wl5 e = new je5(xk4Var, paVar, false).e();
                    try {
                        if (e.m0 && (yl5Var = e.Z) != null && (r = yl5Var.r()) != null) {
                            JSONArray optJSONArray = new JSONObject(r).optJSONArray("choices");
                            if (optJSONArray != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                                jSONObject = optJSONObject.optJSONObject("message");
                            }
                            if (jSONObject != null && (optString = jSONObject.optString("content")) != null) {
                                String obj9 = qs6.T0(optString).toString();
                                if (obj9 != null) {
                                    str7 = obj9;
                                }
                            }
                        }
                        e.close();
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th20) {
                            ge7.t(e, th);
                        }
                    }
                }
                return str7;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ij1 ij1Var = (ij1) obj4;
                mm6 mm6Var = (mm6) obj5;
                for (sb4 sb4Var : (Set) ((qa4) this.Y).getValue()) {
                    if (!((List) ij1Var.b().e.A.getValue()).contains(sb4Var) && !mm6Var.contains(sb4Var)) {
                        ij1Var.b().c(sb4Var);
                    }
                }
                return jg7Var;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yb2 yb2Var = ((sz1) this.Y).s;
                pq5 pq5Var2 = ((dy1) obj4).a;
                c46 c46Var = (c46) obj5;
                yb2Var.getClass();
                pq5Var2.getClass();
                c46Var.getClass();
                int i24 = c46Var.a;
                if (c46Var.b) {
                    zl1 e2 = yb2Var.e(pq5Var2);
                    if (e2 != null) {
                        String a = yb2Var.a(pq5Var2);
                        if (a != null) {
                            zl1 f = e2.f(a + ".ml" + i24);
                            if (f != null) {
                                f.d();
                            }
                            b46 b46Var = yb2Var.c;
                            File a2 = b46Var.a(pq5Var2, c46Var, false);
                            if (a2 != null) {
                                b46Var.c(a2);
                                a2.delete();
                            }
                            yb2Var.f(pq5Var2, i24, null);
                        } else {
                            throw new Exception("Could not determine ROM file name");
                        }
                    } else {
                        throw new Exception("Could not create parent directory document");
                    }
                }
                return yb2Var.c(pq5Var2);
            case 7:
                w61 w61Var2 = (w61) this.Y;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Uri uri3 = (Uri) obj5;
                try {
                    ParcelFileDescriptor openFileDescriptor = ((sz1) obj4).b.getContentResolver().openFileDescriptor(uri3, "r");
                    if (openFileDescriptor != null) {
                        long statSize = openFileDescriptor.getStatSize();
                        if (0 > statSize || statSize >= 12) {
                            byte[] bArr7 = new byte[12];
                            FileInputStream fileInputStream3 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            int read3 = fileInputStream3.read(bArr7);
                            fileInputStream3.close();
                            if (read3 >= 12) {
                                if (bArr7[0] == 77 && bArr7[1] == 69 && bArr7[2] == 76 && bArr7[3] == 78) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i25 = (bArr7[4] & 255) | ((bArr7[5] & 255) << 8);
                                int i26 = (bArr7[6] & 255) | ((bArr7[7] & 255) << 8);
                                long j6 = (bArr7[8] & 255) | ((bArr7[9] & 255) << 8) | ((bArr7[10] & 255) << 16) | ((bArr7[11] & 255) << 24);
                                if (z2) {
                                    if (i25 == 13) {
                                        if (i26 <= 0) {
                                            if (statSize >= 0) {
                                                break;
                                            }
                                            openFileDescriptor.close();
                                            z4 = z3;
                                        }
                                    }
                                }
                            }
                        }
                        z3 = false;
                        openFileDescriptor.close();
                        z4 = z3;
                    }
                    em5Var = Boolean.valueOf(z4);
                } catch (Throwable th21) {
                    em5Var = new em5(th21);
                }
                Throwable a3 = hm5.a(em5Var);
                if (a3 != null) {
                    Log.w("AutoState", "Failed to validate savestate header for " + uri3, a3);
                }
                Boolean bool = Boolean.FALSE;
                if (em5Var instanceof em5) {
                    return bool;
                }
                return em5Var;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Toast.makeText((Context) this.Y, "Обложка сохранена: ".concat((String) obj4), 0).show();
                ((qa4) obj5).setValue(Boolean.FALSE);
                return jg7Var;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                w61 w61Var3 = (w61) this.Y;
                a71 a71Var = a71.UNDISPATCHED;
                zy4 zy4Var = (zy4) obj4;
                g17 g17Var = (g17) obj5;
                hv.L(w61Var3, null, a71Var, new z51(zy4Var, g17Var, null, 1), 1);
                return hv.L(w61Var3, null, a71Var, new z51(zy4Var, g17Var, null, 2), 1);
            case 10:
                String str10 = (String) obj5;
                Map map = ((ng0) obj4).A;
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                String str11 = (String) this.Y;
                String obj10 = qs6.T0(str11).toString();
                if (!qs6.v0(obj10)) {
                    String lowerCase = obj10.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String str12 = (String) map.get(lowerCase);
                    if (str12 == null) {
                        String a4 = qp2.a(obj10, str10);
                        if (nb3.k(a4, obj10)) {
                            Pattern compile = Pattern.compile("\\s+");
                            compile.getClass();
                            qs6.H0(0);
                            Matcher matcher = compile.matcher(obj10);
                            if (!matcher.find()) {
                                list = hf.b0(obj10.toString());
                            } else {
                                ArrayList arrayList = new ArrayList(10);
                                int i27 = 0;
                                do {
                                    arrayList.add(obj10.subSequence(i27, matcher.start()).toString());
                                    i27 = matcher.end();
                                } while (matcher.find());
                                arrayList.add(obj10.subSequence(i27, obj10.length()).toString());
                                list = arrayList;
                            }
                            ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                            for (String str13 : list) {
                                String lowerCase2 = qs6.U0(qs6.T0(str13).toString(), ',', '.', '!', '?', ':', ';', '\"', '\'').toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                String str14 = (String) map.get(lowerCase2);
                                if (str14 != null) {
                                    int length = str13.length() - 1;
                                    while (true) {
                                        if (-1 < length) {
                                            if (qs6.k0(",.!:;?\"'", str13.charAt(length))) {
                                                length--;
                                            } else {
                                                str4 = str13.substring(length + 1);
                                            }
                                        } else {
                                            str4 = str13;
                                        }
                                    }
                                    int length2 = str13.length();
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 < length2) {
                                            if (!qs6.k0(",.!:;?\"'", str13.charAt(i28))) {
                                                str13 = str13.substring(0, i28);
                                            } else {
                                                i28++;
                                            }
                                        }
                                    }
                                    str13 = lb1.m(str13, str14, str4);
                                }
                                arrayList2.add(str13);
                            }
                            return qp2.a(gt0.P0(arrayList2, " ", null, null, null, 62), str10);
                        }
                        return a4;
                    }
                    return str12;
                }
                return str11;
            case 11:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Object K0 = gt0.K0(((ss4) obj5).h(), ((ss5) this.Y).a);
                if (K0 instanceof mr5) {
                    mr5Var = (mr5) K0;
                } else {
                    mr5Var = null;
                }
                if (mr5Var != null) {
                    pq5Var = mr5Var.a;
                }
                ((qn2) obj4).g(pq5Var);
                return jg7Var;
            case 12:
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                l06 l06Var = ((RomDetailsActivity) this.Y).B0;
                if (l06Var != null) {
                    l06Var.b((pq5) obj4, (Uri) obj5);
                    return jg7Var;
                }
                nb3.a0("romSaveFileManager");
                throw null;
            case 13:
                return v(obj);
            case 14:
                return x(obj);
            case 15:
                return z(obj);
            default:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (((Boolean) ((qa4) obj5).getValue()).booleanValue()) {
                    ((qn2) this.Y).g((o6) obj4);
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }
}
