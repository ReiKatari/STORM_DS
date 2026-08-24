package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm4  reason: default package */
/* loaded from: classes.dex */
public final class jm4 {
    public final List a;

    public jm4() {
        na naVar = na.ADRENO_8XX;
        na naVar2 = na.ADRENO_7XX;
        na naVar3 = na.ADRENO_6XX;
        na naVar4 = na.ADRENO_OTHER;
        this.a = hf.c0(new hm4("turnip-banner-26-3-0-r17", "Turnip Mesa (The412Banner Build v26.3.0 R17 — 18.08.2026)", "26.3.0-r17-Banner", "2026-08-18", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "👑 Новейшая сборка от The412Banner (18 августа 2026) на базе Mesa 26.3 с поддержкой Vulkan 1.4, расширенными лимитами дескрипторов и нулевым инпут-лагом для Adreno 6xx/7xx/8xx.", "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17.zip", 2.55d, true), new hm4("turnip-banner-26-3-0-r17-a8xx", "Turnip Mesa (The412Banner v26.3.0 R17 for Adreno 8xx / Snapdragon 8 Elite)", "26.3.0-r17-A8xx", "2026-08-18", fv.V0(new na[]{naVar, naVar4}), "⚡ Специализированная сборка The412Banner для новейших GPU Adreno 830 / 840 (Snapdragon 8 Elite / 8 Gen 4) с максимальным FPS.", "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17-A8xx.zip", 2.55d, true), new hm4("turnip-mrpurple-26-3-0-t30", "Turnip Mesa (MrPurple Build v26.3.0-devel T-30 — 18.08.2026)", "26.3.0-devel-T30", "2026-08-18", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "🔥 Популярная сборка от автора MrPurple на базе ветки Mesa 26.3 с поддержкой Vulkan 1.4.359 и высокой стабильностью.", "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17.zip", 2.55d, true), new hm4("turnip-whitebelyash-v31", "Turnip Mesa (whitebelyash Build v31 / Mainline — 17.08.2026)", "v31-wb", "2026-08-17", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "⚡ Экстремально оптимизированная сборка от whitebelyash (17 августа 2026) с тонкой настройкой кэширования пайплайнов и увеличенным FPS.", "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v31/mainline-turnip-V31.zip", 2.55d, true), new hm4("turnip-whitebelyash-v31-sync", "Turnip Mesa (whitebelyash Build v31 Sync — 17.08.2026)", "v31-sync-wb", "2026-08-17", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "Сборка от whitebelyash с синхронизацией командного буфера GPU для стабильной частоты кадров без разрывов.", "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v31/mainline-turnip-sync-V31.zip", 2.55d, false), new hm4("turnip-mrpurple-26-2-0-r28", "Turnip Mesa (MrPurple Build v26.2.0-r28 — Август 2026)", "26.2.0-r28-MrP", "2026-08-16", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "Ревизия от MrPurple с агрессивным компилятором SPIR-V шейдеров и стабильным фреймрейтом.", "https://github.com/The412Banner/Banners-Turnip/releases/download/v26.3.0-20260818-r17/Turnip-v26.3.0-20260818-r17.zip", 2.55d, false), new hm4("turnip-whitebelyash-v30", "Turnip Mesa (whitebelyash Build v30 — 10.08.2026)", "v30-wb", "2026-08-10", fv.V0(new na[]{naVar2, naVar3, naVar, naVar4}), "Сборка от whitebelyash с оптимизацией тайлинга текстур и консервативной растеризации.", "https://github.com/whitebelyash/AdrenoToolsDrivers/releases/download/tu_v30/mainline-turnip-V30.zip", 2.55d, false), new hm4("qualcomm-v849", "Qualcomm Adreno Driver v849 (Июль 2026)", "v849", "2026-07-25", fv.V0(new na[]{naVar, naVar2, naVar4}), "Официальный проприетарный пакет Qualcomm (Июль 2026) с нативной поддержкой Vulkan 1.3/1.4 и Snapdragon 8 Elite / 8 Gen 3.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v849/Qualcomm_849_adpkg.zip", 22.58d, true), new hm4("qualcomm-v842-6", "Qualcomm Adreno Driver v842.6 (Июнь 2026)", "v842.6", "2026-06-20", fv.V0(new na[]{naVar, naVar2, naVar4}), "Официальный драйвер Qualcomm для чипсетов Snapdragon 8 Gen 2 / 8 Gen 3 / 8 Elite.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v842.6/8Elite2-842.6.zip", 23.4d, false), new hm4("turnip-v26-0-0-rc6-gmem", "Turnip Mesa v26.0.0 RC6 (GMEM — Май 2026)", "v26.0.0-rc06-gmem", "2026-05-15", fv.V0(new na[]{naVar2, naVar3, naVar, naVar4}), "Сборка Turnip Mesa с оптимизацией скоростной локальной памяти GMEM для Adreno 6xx/7xx.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc06/Turnip_v26.0.0_R6_Gmem.zip", 3.38d, false), new hm4("turnip-v26-0-0-rc6-sysmem", "Turnip Mesa v26.0.0 RC6 (Sysmem — Май 2026)", "v26.0.0-rc06-sysmem", "2026-05-15", fv.V0(new na[]{naVar2, naVar3, naVar, naVar4}), "Сборка Turnip Mesa с прямой адресацией системной памяти Sysmem для максимальной стабильности.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc06/Turnip_v26.0.0_R6_Sysmem.zip", 3.38d, false), new hm4("turnip-v26-0-0-rc5", "Turnip Mesa v26.0.0 RC5 (Апрель 2026)", "v26.0.0-rc05", "2026-04-10", fv.V0(new na[]{naVar2, naVar3, naVar4}), "Стабильный релиз Turnip Mesa с поддержкой динамического рендеринга и исправлением артефактов текстур.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v26.0.0-rc05/Turnip_v26.0.0_R5.zip", 3.35d, false), new hm4("turnip-v25-3-0-rc11", "Turnip Mesa v25.3.0 R11 (Февраль 2026)", "v25.3.0-rc11", "2026-02-18", fv.V0(new na[]{naVar2, naVar3, naVar4}), "Популярный релиз Turnip Mesa с оптимизацией тепловыделения на Snapdragon 8 Gen 1/2/3.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v25.3.0-rc.11/Turnip_v25.3.0_R11.zip", 3.3d, false), new hm4("qualcomm-v819-2", "Qualcomm Adreno Driver v819.2 (Январь 2026)", "v819.2", "2026-01-20", fv.V0(new na[]{naVar, naVar2, naVar3, naVar4}), "Проприетарный пакет Qualcomm для стабильной работы на Adreno 6xx/7xx/8xx.", "https://github.com/K11MCH1/AdrenoToolsDrivers/releases/download/v819.2/Qualcomm_819.2_adpkg.zip", 21.8d, false));
    }

    public final List a(na naVar) {
        naVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            hm4 hm4Var = (hm4) obj;
            if (hm4Var.e.contains(naVar) || hm4Var.e.contains(na.ADRENO_OTHER)) {
                arrayList.add(obj);
            }
        }
        return gt0.d1(arrayList, new zh2(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hm4 b(na naVar) {
        Object obj;
        Object obj2;
        naVar.getClass();
        List a = a(naVar);
        Object obj3 = null;
        if (im4.a[naVar.ordinal()] == 1) {
            for (Object obj4 : a) {
                String str = ((hm4) obj4).a;
                if (str.equals("qualcomm-v830-0") || str.equals("turnip-mrpurple-26-3-0-t30") || str.equals("turnip-whitebelyash-26-3-0-v14359")) {
                    obj3 = obj4;
                    break;
                }
                while (r7.hasNext()) {
                }
            }
            hm4 hm4Var = (hm4) obj3;
            if (hm4Var == null) {
                return (hm4) gt0.J0(a);
            }
            return hm4Var;
        }
        Iterator it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((hm4) obj).a.equals("turnip-mrpurple-26-3-0-t30")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hm4 hm4Var2 = (hm4) obj;
        if (hm4Var2 == null) {
            Iterator it2 = a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((hm4) obj2).a.equals("turnip-whitebelyash-26-3-0-v14359")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            hm4Var2 = (hm4) obj2;
            if (hm4Var2 == null) {
                Iterator it3 = a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((hm4) next).a.equals("turnip-mrpurple-26-2-0-r28")) {
                        obj3 = next;
                        break;
                    }
                }
                hm4 hm4Var3 = (hm4) obj3;
                if (hm4Var3 == null) {
                    return (hm4) gt0.J0(a);
                }
                return hm4Var3;
            }
        }
        return hm4Var2;
    }
}
