package defpackage;

import android.util.Log;
import defpackage.sz1;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z12  reason: default package */
/* loaded from: classes.dex */
public final class z12 extends hw6 implements eo2 {
    public en5 X;
    public uz1 Y;
    public List Z;
    public boolean d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ sz1 g0;
    public final /* synthetic */ pq5 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(sz1 sz1Var, pq5 pq5Var, r41 r41Var) {
        super(2, r41Var);
        this.g0 = sz1Var;
        this.h0 = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((z12) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        z12 z12Var = new z12(this.g0, this.h0, r41Var);
        z12Var.f0 = obj;
        return z12Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0274, code lost:
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0306, code lost:
        if (defpackage.sz1.H(r2, r4, r19) == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0253 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025b A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d0 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032f A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[Catch: all -> 0x001e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x0019, B:134:0x0309, B:11:0x0023, B:117:0x02b9, B:119:0x02bf, B:121:0x02c3, B:123:0x02c7, B:126:0x02cc, B:128:0x02d0, B:130:0x02d6, B:131:0x02df, B:135:0x032f, B:136:0x0334, B:137:0x0335, B:14:0x002e, B:114:0x0293, B:17:0x0039, B:108:0x0272, B:110:0x0276, B:111:0x0278, B:20:0x0042, B:100:0x0245, B:102:0x0253, B:105:0x025b, B:23:0x004b, B:93:0x01b5, B:96:0x021b, B:99:0x0236, B:67:0x0113, B:71:0x0145, B:73:0x0158, B:76:0x015e, B:80:0x0181, B:84:0x0193, B:89:0x01a8, B:70:0x011c, B:30:0x0062, B:45:0x00cb, B:48:0x00d7, B:50:0x00de, B:60:0x00f3, B:72:0x0149, B:55:0x00e4, B:57:0x00e7, B:58:0x00e8, B:33:0x006b, B:35:0x008d, B:36:0x0097, B:38:0x009f, B:39:0x00a9, B:41:0x00b1, B:42:0x00bb, B:49:0x00d8, B:56:0x00e5, B:26:0x0058, B:64:0x010a, B:61:0x00f7), top: B:148:0x0010 }] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object w0;
        boolean booleanValue;
        en5 a;
        en5 en5Var;
        uz1 uz1Var;
        Object j;
        String str;
        uz1 a2;
        sz1.b bVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Throwable a3;
        pw5 b;
        lx5 lx5Var;
        Object w;
        List list;
        sz1 sz1Var;
        jt5 jt5Var;
        Object d0;
        cy5 cy5Var;
        w61 w61Var = (w61) this.f0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        try {
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                Log.e("EmulatorViewModel", "Failed to launch ROM '" + this.h0.a + "'", th);
                this.g0.k0("rom_launch_exception");
                tp6 tp6Var = this.g0.p0;
                ay1 ay1Var = ay1.a;
                tp6Var.getClass();
                tp6Var.m(null, ay1Var);
            } else {
                throw th;
            }
        }
        switch (this.e0) {
            case 0:
                oi2.Y(obj);
                tp6 tp6Var2 = this.g0.p0;
                zx1 zx1Var = new zx1(null, null);
                tp6Var2.getClass();
                tp6Var2.m(null, zx1Var);
                sz1 sz1Var2 = this.g0;
                pq5 pq5Var = this.h0;
                sz1Var2.n1 = pq5Var;
                sz1Var2.v0.l(pq5Var);
                jq1 jq1Var = this.h0.f.p;
                if (jq1Var != null) {
                    tp6 tp6Var3 = this.g0.X0;
                    tp6Var3.getClass();
                    tp6Var3.m(null, jq1Var);
                }
                Boolean bool = this.h0.f.q;
                if (bool != null) {
                    tp6 tp6Var4 = this.g0.V0;
                    tp6Var4.getClass();
                    tp6Var4.m(null, bool);
                }
                Boolean bool2 = this.h0.f.r;
                if (bool2 != null) {
                    tp6 tp6Var5 = this.g0.Z0;
                    tp6Var5.getClass();
                    tp6Var5.m(null, bool2);
                }
                sz1 sz1Var3 = this.g0;
                pq5 pq5Var2 = this.h0;
                this.f0 = w61Var;
                this.e0 = 1;
                w0 = sz1Var3.w0(pq5Var2, this);
                if (w0 == x61Var) {
                    return x61Var;
                }
                booleanValue = ((Boolean) w0).booleanValue();
                cn5 cn5Var = this.g0.d;
                if (!booleanValue) {
                    synchronized (cn5Var) {
                        a = cn5Var.a();
                        cn5Var.c = a;
                    }
                } else {
                    synchronized (cn5Var) {
                        cn5Var.c = null;
                    }
                    a = this.g0.d.a();
                }
                en5Var = a;
                if (!booleanValue) {
                    sz1 sz1Var4 = this.g0;
                    pq5 pq5Var3 = this.h0;
                    this.f0 = null;
                    this.X = en5Var;
                    this.Y = null;
                    this.d0 = booleanValue;
                    this.e0 = 2;
                    j = sz1.j(sz1Var4, pq5Var3, en5Var, this);
                    if (j == x61Var) {
                        return x61Var;
                    }
                    uz1 uz1Var2 = (uz1) j;
                    pq5 pq5Var4 = this.h0;
                    a3 = hm5.a(uz1Var2);
                    if (a3 == null) {
                        Log.e("EmulatorViewModel", "RetroAchievements launch decision failed for '" + pq5Var4.a + "'", a3);
                        uz1Var2 = new uz1(sz1.b.ONLINE_LIVE, sz1.d.SOFTCORE, null, false, false, false);
                    }
                    uz1Var = uz1Var2;
                    str = en5Var.e;
                    if (str == null) {
                        str = "";
                    }
                    a2 = uz1.a(uz1Var, null, null, null, str, en5Var.f, 127);
                    sz1 sz1Var5 = this.g0;
                    bVar = a2.a;
                    sz1Var5.G = bVar;
                    sz1Var5.H = a2.b;
                    sz1Var5.I = a2.d;
                    if (bVar == sz1.b.ONLINE_LIVE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sz1Var5.J = z;
                    rx1 rx1Var = new rx1(this.h0);
                    if (a2.b == sz1.d.HARDCORE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f0 = null;
                    this.X = null;
                    this.Y = a2;
                    this.d0 = booleanValue;
                    this.e0 = 3;
                    sx1 sx1Var = sz1Var5.w;
                    sx1Var.b = booleanValue;
                    if (!booleanValue && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sx1Var.a = z3;
                    sx1Var.d = false;
                    sx1Var.e = rx1Var;
                    if (jg7.a != x61Var) {
                        z4 = booleanValue;
                        sz1 sz1Var6 = this.g0;
                        hv.L(sz1Var6.z, null, null, new hz1(22, null, sz1Var6), 3);
                        sz1 sz1Var7 = this.g0;
                        hv.L(sz1Var7.z, null, null, new hz1(25, null, sz1Var7), 3);
                        sz1 sz1Var8 = this.g0;
                        hv.L(sz1Var8.z, null, null, new hz1(24, null, sz1Var8), 3);
                        sz1 sz1Var9 = this.g0;
                        hv.L(sz1Var9.z, null, null, new hz1(23, null, sz1Var9), 3);
                        sz1 sz1Var10 = this.g0;
                        hv.L(sz1Var10.z, null, null, new hz1(19, null, sz1Var10), 3);
                        sz1 sz1Var11 = this.g0;
                        hv.L(sz1Var11.z, null, null, new hz1(18, null, sz1Var11), 3);
                        sz1 sz1Var12 = this.g0;
                        hv.L(sz1Var12.z, null, null, new hz1(21, null, sz1Var12), 3);
                        sz1 sz1Var13 = this.g0;
                        if (!z4) {
                            tu0 Z0 = sz1Var13.Z0(this.h0, a2);
                            this.f0 = null;
                            this.X = null;
                            this.Y = null;
                            this.d0 = z4;
                            this.e0 = 4;
                            Object q = Z0.q(this);
                            x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                            if (q == x61Var) {
                                return x61Var;
                            }
                        } else {
                            sz1Var13.N = null;
                            sz1Var13.O = sz1.c.DISABLED;
                            sx1 sx1Var2 = sz1Var13.w;
                            sx1Var2.d = false;
                            sx1Var2.d(dp2.DISABLED_BY_SETTING);
                        }
                        sz1 sz1Var14 = this.g0;
                        pq5 pq5Var5 = this.h0;
                        b = sz1Var14.p.b(pq5Var5.d);
                        if (b != null) {
                            lx5Var = b.a(pq5Var5);
                        } else {
                            lx5Var = null;
                        }
                        if (lx5Var != null) {
                            sz1 sz1Var15 = this.g0;
                            this.f0 = null;
                            this.X = null;
                            this.Y = null;
                            this.Z = null;
                            this.d0 = z4;
                            this.e0 = 5;
                            w = sz1.w(sz1Var15, lx5Var, this);
                            if (w == x61Var) {
                                return x61Var;
                            }
                            list = (List) w;
                            break;
                        }
                        list = yt1.A;
                        sz1Var = this.g0;
                        jt5Var = this.h0.f;
                        this.f0 = null;
                        this.X = null;
                        this.Y = null;
                        this.Z = list;
                        this.d0 = z4;
                        this.e0 = 6;
                        if (sz1.i(sz1Var, jt5Var, this) == x61Var) {
                            return x61Var;
                        }
                        jh jhVar = this.g0.v;
                        pq5 pq5Var6 = this.h0;
                        this.f0 = null;
                        this.X = null;
                        this.Y = null;
                        this.Z = null;
                        this.d0 = z4;
                        this.e0 = 7;
                        jhVar.getClass();
                        xe1 xe1Var = xk1.a;
                        d0 = hv.d0(de1.L, new dh(pq5Var6, jhVar, list, null), this);
                        if (d0 == x61Var) {
                            return x61Var;
                        }
                        cy5Var = (cy5) d0;
                        if (!(cy5Var instanceof yx5) && !(cy5Var instanceof zx5) && !(cy5Var instanceof ay5) && !(cy5Var instanceof xx5)) {
                            if (!(cy5Var instanceof by5)) {
                                if (!((by5) cy5Var).a) {
                                    this.g0.J0.k(u67.a);
                                }
                                tp6 tp6Var6 = this.g0.p0;
                                dy1 dy1Var = new dy1(this.h0);
                                tp6Var6.getClass();
                                tp6Var6.m(null, dy1Var);
                                sz1 sz1Var16 = this.g0;
                                pq5 pq5Var7 = this.h0;
                                this.f0 = null;
                                this.X = null;
                                this.Y = null;
                                this.Z = null;
                                this.d0 = z4;
                                this.e0 = 8;
                                break;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                        this.g0.k0("rom_load_failed");
                        tp6 tp6Var7 = this.g0.p0;
                        ay1 ay1Var2 = ay1.a;
                        tp6Var7.getClass();
                        tp6Var7.m(null, ay1Var2);
                        return jg7.a;
                    }
                    return x61Var;
                }
                uz1Var = new uz1(sz1.b.ONLINE_LIVE, sz1.d.SOFTCORE, null, false, false, false);
                str = en5Var.e;
                if (str == null) {
                }
                a2 = uz1.a(uz1Var, null, null, null, str, en5Var.f, 127);
                sz1 sz1Var52 = this.g0;
                bVar = a2.a;
                sz1Var52.G = bVar;
                sz1Var52.H = a2.b;
                sz1Var52.I = a2.d;
                if (bVar == sz1.b.ONLINE_LIVE) {
                }
                sz1Var52.J = z;
                rx1 rx1Var2 = new rx1(this.h0);
                if (a2.b == sz1.d.HARDCORE) {
                }
                this.f0 = null;
                this.X = null;
                this.Y = a2;
                this.d0 = booleanValue;
                this.e0 = 3;
                sx1 sx1Var3 = sz1Var52.w;
                sx1Var3.b = booleanValue;
                if (!booleanValue) {
                }
                z3 = false;
                sx1Var3.a = z3;
                sx1Var3.d = false;
                sx1Var3.e = rx1Var2;
                if (jg7.a != x61Var) {
                }
                break;
            case 1:
                oi2.Y(obj);
                w0 = obj;
                booleanValue = ((Boolean) w0).booleanValue();
                cn5 cn5Var2 = this.g0.d;
                if (!booleanValue) {
                }
                en5Var = a;
                if (!booleanValue) {
                }
                break;
            case 2:
                booleanValue = this.d0;
                w61 w61Var2 = (w61) this.Y;
                en5Var = this.X;
                oi2.Y(obj);
                j = obj;
                uz1 uz1Var22 = (uz1) j;
                pq5 pq5Var42 = this.h0;
                a3 = hm5.a(uz1Var22);
                if (a3 == null) {
                }
                uz1Var = uz1Var22;
                str = en5Var.e;
                if (str == null) {
                }
                a2 = uz1.a(uz1Var, null, null, null, str, en5Var.f, 127);
                sz1 sz1Var522 = this.g0;
                bVar = a2.a;
                sz1Var522.G = bVar;
                sz1Var522.H = a2.b;
                sz1Var522.I = a2.d;
                if (bVar == sz1.b.ONLINE_LIVE) {
                }
                sz1Var522.J = z;
                rx1 rx1Var22 = new rx1(this.h0);
                if (a2.b == sz1.d.HARDCORE) {
                }
                this.f0 = null;
                this.X = null;
                this.Y = a2;
                this.d0 = booleanValue;
                this.e0 = 3;
                sx1 sx1Var32 = sz1Var522.w;
                sx1Var32.b = booleanValue;
                if (!booleanValue) {
                }
                z3 = false;
                sx1Var32.a = z3;
                sx1Var32.d = false;
                sx1Var32.e = rx1Var22;
                if (jg7.a != x61Var) {
                }
                break;
            case 3:
                z4 = this.d0;
                a2 = this.Y;
                oi2.Y(obj);
                sz1 sz1Var62 = this.g0;
                hv.L(sz1Var62.z, null, null, new hz1(22, null, sz1Var62), 3);
                sz1 sz1Var72 = this.g0;
                hv.L(sz1Var72.z, null, null, new hz1(25, null, sz1Var72), 3);
                sz1 sz1Var82 = this.g0;
                hv.L(sz1Var82.z, null, null, new hz1(24, null, sz1Var82), 3);
                sz1 sz1Var92 = this.g0;
                hv.L(sz1Var92.z, null, null, new hz1(23, null, sz1Var92), 3);
                sz1 sz1Var102 = this.g0;
                hv.L(sz1Var102.z, null, null, new hz1(19, null, sz1Var102), 3);
                sz1 sz1Var112 = this.g0;
                hv.L(sz1Var112.z, null, null, new hz1(18, null, sz1Var112), 3);
                sz1 sz1Var122 = this.g0;
                hv.L(sz1Var122.z, null, null, new hz1(21, null, sz1Var122), 3);
                sz1 sz1Var132 = this.g0;
                if (!z4) {
                }
                sz1 sz1Var142 = this.g0;
                pq5 pq5Var52 = this.h0;
                b = sz1Var142.p.b(pq5Var52.d);
                if (b != null) {
                }
                if (lx5Var != null) {
                }
                list = yt1.A;
                sz1Var = this.g0;
                jt5Var = this.h0.f;
                this.f0 = null;
                this.X = null;
                this.Y = null;
                this.Z = list;
                this.d0 = z4;
                this.e0 = 6;
                if (sz1.i(sz1Var, jt5Var, this) == x61Var) {
                }
                jh jhVar2 = this.g0.v;
                pq5 pq5Var62 = this.h0;
                this.f0 = null;
                this.X = null;
                this.Y = null;
                this.Z = null;
                this.d0 = z4;
                this.e0 = 7;
                jhVar2.getClass();
                xe1 xe1Var2 = xk1.a;
                d0 = hv.d0(de1.L, new dh(pq5Var62, jhVar2, list, null), this);
                if (d0 == x61Var) {
                }
                cy5Var = (cy5) d0;
                if (!(cy5Var instanceof yx5)) {
                    if (!(cy5Var instanceof by5)) {
                    }
                    break;
                }
                this.g0.k0("rom_load_failed");
                tp6 tp6Var72 = this.g0.p0;
                ay1 ay1Var22 = ay1.a;
                tp6Var72.getClass();
                tp6Var72.m(null, ay1Var22);
                return jg7.a;
            case 4:
                z4 = this.d0;
                oi2.Y(obj);
                sz1 sz1Var1422 = this.g0;
                pq5 pq5Var522 = this.h0;
                b = sz1Var1422.p.b(pq5Var522.d);
                if (b != null) {
                }
                if (lx5Var != null) {
                }
                list = yt1.A;
                sz1Var = this.g0;
                jt5Var = this.h0.f;
                this.f0 = null;
                this.X = null;
                this.Y = null;
                this.Z = list;
                this.d0 = z4;
                this.e0 = 6;
                if (sz1.i(sz1Var, jt5Var, this) == x61Var) {
                }
                jh jhVar22 = this.g0.v;
                pq5 pq5Var622 = this.h0;
                this.f0 = null;
                this.X = null;
                this.Y = null;
                this.Z = null;
                this.d0 = z4;
                this.e0 = 7;
                jhVar22.getClass();
                xe1 xe1Var22 = xk1.a;
                d0 = hv.d0(de1.L, new dh(pq5Var622, jhVar22, list, null), this);
                if (d0 == x61Var) {
                }
                cy5Var = (cy5) d0;
                if (!(cy5Var instanceof yx5)) {
                }
                this.g0.k0("rom_load_failed");
                tp6 tp6Var722 = this.g0.p0;
                ay1 ay1Var222 = ay1.a;
                tp6Var722.getClass();
                tp6Var722.m(null, ay1Var222);
                return jg7.a;
            case 5:
                z4 = this.d0;
                lx5 lx5Var2 = (lx5) this.Z;
                oi2.Y(obj);
                w = obj;
                list = (List) w;
                break;
            case 6:
                z4 = this.d0;
                list = this.Z;
                oi2.Y(obj);
                jh jhVar222 = this.g0.v;
                pq5 pq5Var6222 = this.h0;
                this.f0 = null;
                this.X = null;
                this.Y = null;
                this.Z = null;
                this.d0 = z4;
                this.e0 = 7;
                jhVar222.getClass();
                xe1 xe1Var222 = xk1.a;
                d0 = hv.d0(de1.L, new dh(pq5Var6222, jhVar222, list, null), this);
                if (d0 == x61Var) {
                }
                cy5Var = (cy5) d0;
                if (!(cy5Var instanceof yx5)) {
                }
                this.g0.k0("rom_load_failed");
                tp6 tp6Var7222 = this.g0.p0;
                ay1 ay1Var2222 = ay1.a;
                tp6Var7222.getClass();
                tp6Var7222.m(null, ay1Var2222);
                return jg7.a;
            case 7:
                z4 = this.d0;
                oi2.Y(obj);
                d0 = obj;
                cy5Var = (cy5) d0;
                if (!(cy5Var instanceof yx5)) {
                }
                this.g0.k0("rom_load_failed");
                tp6 tp6Var72222 = this.g0.p0;
                ay1 ay1Var22222 = ay1.a;
                tp6Var72222.getClass();
                tp6Var72222.m(null, ay1Var22222);
                return jg7.a;
            case 8:
                oi2.Y(obj);
                lc1 lc1Var = lc1.a;
                pq5 pq5Var8 = this.h0;
                lc1.b(pq5Var8.d, pq5Var8.a);
                sz1 sz1Var17 = this.g0;
                hv.L(sz1Var17.z, null, null, new p12(1, null, sz1Var17), 3);
                sz1 sz1Var18 = this.g0;
                hv.L(sz1Var18.z, null, null, new c0(sz1Var18, this.h0, null), 3);
                return jg7.a;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
