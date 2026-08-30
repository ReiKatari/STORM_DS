package kf;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ d2 B;

    public /* synthetic */ y1(d2 d2Var, int i2) {
        this.A = i2;
        this.B = d2Var;
    }

    @Override // mc.a
    public final Object b() {
        oe.j jVar;
        FileInputStream fileInputStream;
        od.c cVar;
        jd.a serializer;
        pd.k kVar;
        pd.c0 c0Var;
        int i2;
        String str;
        UUID fromString;
        switch (this.A) {
            case 0:
                d2 d2Var = this.B;
                try {
                    fileInputStream = new FileInputStream(new File(d2Var.f8180a.getFilesDir(), "controller_config.json"));
                    cVar = d2Var.f8182c;
                    serializer = mf.a.Companion.serializer();
                    serializer.getClass();
                    l.i0 i0Var = new l.i0(fileInputStream);
                    kVar = (pd.k) i0Var.B;
                    c0Var = new pd.c0(i0Var, pd.i.L.h(16384));
                } catch (Exception unused) {
                    oe.y yVar = new oe.y(oe.s.A, new oe.v(97, null), 4);
                    oe.y yVar2 = new oe.y(oe.s.B, new oe.v(96, null), 4);
                    oe.y yVar3 = new oe.y(oe.s.X, new oe.v(100, null), 4);
                    oe.y yVar4 = new oe.y(oe.s.Y, new oe.v(99, null), 4);
                    oe.s sVar = oe.s.LEFT;
                    oe.t tVar = oe.t.NEGATIVE;
                    oe.y yVar5 = new oe.y(sVar, new oe.u(null, 15, tVar), new oe.u(null, 0, tVar));
                    oe.s sVar2 = oe.s.RIGHT;
                    oe.t tVar2 = oe.t.POSITIVE;
                    jVar = new oe.j(p7.t.y(yVar, yVar2, yVar3, yVar4, yVar5, new oe.y(sVar2, new oe.u(null, 15, tVar2), new oe.u(null, 0, tVar2)), new oe.y(oe.s.UP, new oe.u(null, 16, tVar), new oe.u(null, 1, tVar)), new oe.y(oe.s.DOWN, new oe.u(null, 16, tVar2), new oe.u(null, 1, tVar2)), new oe.y(oe.s.L, new oe.v(102, null), 4), new oe.y(oe.s.R, new oe.v(103, null), 4), new oe.y(oe.s.START, new oe.v(108, null), 4), new oe.y(oe.s.SELECT, new oe.v(109, null), 4), new oe.y(oe.s.PAUSE, new oe.v(110, null), 4)));
                }
                try {
                    Object t5 = new pd.e0(cVar, pd.k0.OBJ, c0Var, serializer.e(), null).t(serializer);
                    c0Var.n();
                    kVar.getClass();
                    pd.e eVar = pd.e.L;
                    byte[] array = kVar.f11595c.array();
                    array.getClass();
                    eVar.getClass();
                    eVar.e(array);
                    jVar = ((mf.a) t5).a();
                    fileInputStream.close();
                    return cd.q.c(jVar);
                } finally {
                    c0Var.C();
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                return Boolean.valueOf(this.B.f8181b.getBoolean("input_touch_haptic_feedback_enabled", true));
            case 2:
                return Integer.valueOf(this.B.f8181b.getInt("input_opacity", 50));
            case 3:
                return this.B.c();
            case 4:
                String string = this.B.f8181b.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -329143742:
                            if (string.equals("always_visible")) {
                                return ue.a.ALWAYS_VISIBLE;
                            }
                            break;
                        case 264288026:
                            if (string.equals("hide_system_buttons_when_controller_connected")) {
                                return ue.a.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
                            }
                            break;
                        case 482345502:
                            if (string.equals("hide_mapped_buttons_when_controller_connected")) {
                                return ue.a.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS;
                            }
                            break;
                        case 2049787261:
                            if (string.equals("always_invisible")) {
                                return ue.a.ALWAYS_INVISIBLE;
                            }
                            break;
                    }
                }
                return ue.a.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED;
            case l1.c.f8511g /* 5 */:
                String string2 = this.B.f8181b.getString("theme", "light");
                string2.getClass();
                String upperCase = string2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return gg.a.valueOf(upperCase);
            case l1.c.f8509e /* 6 */:
                return this.B.d();
            case 7:
                String string3 = this.B.f8181b.getString("dsi_camera_source", "physical_cameras");
                string3.getClass();
                String upperCase2 = string3.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                return qe.a.valueOf(upperCase2);
            case 8:
                String string4 = this.B.f8181b.getString("video_filtering", "none");
                string4.getClass();
                String upperCase3 = string4.toUpperCase(Locale.ROOT);
                upperCase3.getClass();
                return oe.u0.valueOf(upperCase3);
            case l1.c.f8508d /* 9 */:
                String string5 = this.B.f8181b.getString("video_internal_resolution", "1");
                string5.getClass();
                Integer W = vc.o.W(string5);
                if (W != null) {
                    i2 = W.intValue();
                } else {
                    i2 = 1;
                }
                return Integer.valueOf(i2);
            case l1.c.f8510f /* 10 */:
                return Boolean.valueOf(this.B.f8181b.getBoolean("enable_threaded_rendering", true));
            case 11:
                String string6 = this.B.f8181b.getString("video_renderer", "software");
                string6.getClass();
                String upperCase4 = string6.toUpperCase(Locale.ROOT);
                upperCase4.getClass();
                return VideoRenderer.valueOf(upperCase4);
            case 12:
                Set<String> stringSet = this.B.f8181b.getStringSet("dsi_camera_static_image", null);
                if (stringSet != null) {
                    str = (String) zb.l.S(stringSet);
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                return Uri.parse(str);
            default:
                String string7 = this.B.f8181b.getString("input_layout_id", null);
                if (string7 == null || (fromString = UUID.fromString(string7)) == null) {
                    return ve.f.f13797h;
                }
                return fromString;
        }
    }
}
