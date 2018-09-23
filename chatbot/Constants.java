package chatbot;

public final class Constants {
    //используемые ботом фразы, исключая приветствие, и ответы на вопросы
    public final static String[] questions = new String[]{
    	"<html><p align=\"center\">На каком этаже находится \"аквариум\"?</p><br><p align=\"center\"> 1) на четвёртом</p><br><p align=\"center\"> 2) на пятом</p><br><p align=\"center\"> 3) на шестом</p><br><p align=\"center\"> 4) на седьмом</p></html>",
    	"<html><p align=\"center\">Сколько минут длится большак?</p><br><p align=\"center\"> 1) 30</p><br><p align=\"center\"> 2) 40</p><br><p align=\"center\"> 3) 50</p><br><p align=\"center\"> 4) 60",
    	"<html><p align=\"center\">Какой номер кабинета - Хогвартса?</p><br><p align=\"center\"> 1) 50</p><br><p align=\"center\"> 2) 55</p><br><p align=\"center\"> 3) 155</p><br><p align=\"center\"> 4) 150",
        "<html><p align=\"center\">РљР°Рє РїСЂРѕР№С‚Рё РёР· РєРѕСЂРїСѓСЃР° РЅР° РўСѓСЂРіРµРЅРµРІР° РІ РєРѕСЂРїСѓСЃ РЅР° Р›РµРЅРёРЅР°, РЅРµ РІС‹С…РѕРґСЏ РЅР° СѓР»РёС†Сѓ?</p><br><p align=\"center\"> 1) С‚РµР»РµРїРѕСЂС‚РёСЂРѕРІР°С‚СЊСЃСЏ</p><br><p align=\"center\"> 2) С‡РµСЂРµР· С‚СЂРµС‚РёР№ СЌС‚Р°Р¶</p><br><p align=\"center\"> 3) С‡РµСЂРµР· Р±РёР±Р»РёРѕС‚РµРєСѓ РЅР° РІС‚РѕСЂРѕРј СЌС‚Р°Р¶Рµ</p><br><p align=\"center\"> 4) РЅРёРєР°Рє",
        "<html><p align=\"center\">РљРѕРјСѓ РїСЂРёРЅР°РґР»РµР¶РёС‚ С„СЂР°Р·Р° \"РљРѕС€РєР° РЅРµ РјРѕР¶РµС‚ СѓС‡РёС‚СЊСЃСЏ РЅР° РјР°С‚РјРµС…Рµ\"?</p><br><p align=\"center\"> 1) Р РµРїРЅРёС†РєРѕРјСѓ</p><br><p align=\"center\"> 2) Р“РµР№РЅСѓ</p><br><p align=\"center\"> 3) РЎРёР·С‹Р№</p><br><p align=\"center\"> 4) РЅРёРєРѕРјСѓ"};
    public final static int questionsCount = questions.length;
    public final static int[] answers = new int[]{3, 2, 4, 2, 1};
    public final static String greeting = "<html><p align=\"center\">Это викторина из " + questionsCount
            + " вопросов.</p><br><p align=\"center\">Варианты ответа пронумерованы.</p><br><p align=\"center\">В ответ напиши цифру выбранного варианта.</p><br><p align=\"center\">Чтобы начать игру, напиши Играть.</p><br><p align=\"center\">Чтобы увидеть памятку снова, напиши Помощь. Удачи!</p><br></html>";
}
