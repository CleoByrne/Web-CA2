# --- !Ups
DELETE FROM CONTACT;
DELETE FROM ORDER_ITEM;
DELETE FROM PRODUCT;
DELETE FROM SHOP_ORDER;
DELETE FROM SHOPPING_CART;
DELETE FROM USER;

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 1,'LG W7','TV','Simplicity Perfection','Bring home the ultimate expression of cinema-quality experience that was awarded Best of the Best at CES 2017. So stunning. So simple. Picture-on-Wall design allows the television to lay virtually flat so it seems blend with the wall and disappear, only possible with the uniquely efficient technology of LG OLED TV. Beautiful on or off, it is the purest form a television can take and the ultimate in minimalism. From the front or from the side, every seat in the TV room gets a clear, vibrant picture without washed-out tones. The unique design of LG OLED TV assures that any view is a great one, not just for those in the center.',25,7999,4995.99,1,'Resolution: 3840x2160', 'Screen Size: 65"','Display Technology: OLED');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 2,'Samsung Q7F','TV','QLED. The Next Innovation in TV.','Introducing QLED TV, our most spectacular TV yet. An unbelievably brilliant picture made possible by over a billion colors, producing images you have to see to believe. With 100% color volume thanks to Samsung''s proprietary Quantum dots, picture quality and color volume have been elevated beyond any prior Samsung product. As smart as it is beautiful, the new Smart TV knows what’s connected and lets you control everything with one remote.',25,2399.00,null,0,'Resolution: 3840x2160', 'Screen Size: 65"','Display Technology: LED LCD with Quantum Dots');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 3,'Sony A1','TV','Experience a whole new world','Discover incredible contrast on an OLED 4K HDR TV with 8 million self-emitting pixels. Pictures are amazingly real with the deepest blacks providing detailed shadow expression and vibrant colour. Innovative Acoustic Surface™ technology delivers engaging sound directly from the screen.',25,3287.00,2999.99,1,'4K High Dynamic Range', 'Screen Size: 55"','Display Technology: OLED');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 4,'Panasonic TX-65EZ1002B','TV','Hollywood to your home','Created with filmakers in Hollywood to meet their own exacting pro standards, our top 4K Pro HDR TV combines next generation OLED screen with our latest image processor, to deliver colour fidelity, contrast & Brightness. This "prosumer" models Technics turned intergrated soundbar completes the stoy with & presents a striking visual image.',25,5999.00,null,0,'Resolution: 3840x2160 (4K Ultra HD)', 'Screen Size: 65"','Display technology: OLED (AMOLED)');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 5,'LG 65SJ9500','TV','LG Super UHD TV is the pinnacle of LG LED TV','No matter which seat in the TV room one chooses—straight on or at an angle—colors look truer and black levels look deeper. See it in action. Check out interviews of legendary soccer players and behind-the-scenes stories from the LG Nano Cell™ Super Match. Nano Cell Display reveals a billion lifelike colors, 64 times richer than conventional TV. This ability to produce a wider spectrum of color results in superior picture quality.LG SUPER UHD TVs deliver an experience that rivals the local theater. webOS streams the finest entertainment in just a few clicks, looking bold and rich thanks to Active HDR with Dolby Vision™. And the premium harman/kardon® audio system fills the room with deep, nuanced sound.From brilliant brights to deepest darks, LG SUPER UHD TV offers the ultimate expression of high dynamic range. Unlike some other 4K televisions, LG SUPER UHD TVs support Dolby Vision™, optimizing the picture scene-by-scene, as well as the new HLG HDR standard so viewers get more options for premium content.',25,4000,null,0,'Resolution: 3840x2160', 'Screen Size: 65"','Display Technology: LED LCD');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 6,'Samsung KS9000','TV','A Quantum leap in picture quality','See accurate shades and lifelike colors come alive in detail with SUHD Quantum Dot Color that unlocks up to a billion color combinations.Dynamic brightness reveals hidden details. See the sunlight in its full radiant glory and find the small detail in the dark shadows with our best HDR innovation, HDR 1000.',25,5679.59,null,0,'4K SUHD TV', 'Screen Size: 65"','ENERGY STAR® Certified');

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 7,'Samsung HW-MS650','TV Accessories','Simple sounds beautiful.Wireless TV Soundbar with Distortion Cancelling','Soundbar Sound+. Feel the clear, crisp sound engineering by the SAMSUNG Audio Lab. Bring home cinematic depth and richness to your viewing and listening experience.',25,449.99,null,0,'Total Power: 450W', 'Bluetooth 4.0: Supported','Wi-Fi: Supported');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 8,'Sanus Super Slim Full-Motion Mount','TV Accessories','With Fingertip Tilt Technology','The SANUS VLF320 Super Slim full-motion mount places 51" – 70" TVs just 1.23" / 3.12 cm from the wall, yet extends 20" / 53 cm from the wall and allows full-motion capabilities. The VLF320 features fingertip tilt technology, which allows easy TV angle adjustments with the touch of a finger. With its integrated cable management system, the VLF320 keeps loose cables organized and concealed within the extension arm for a clean appearance without compromising TV motion. Its post-installation leveling adjustment ensures the TV is perfectly positioned on the wall. The VLF320 always has a finished appearance with a decorative cover that conceals assembly and mounting hardware.',25,344.98,null,0,'TV Support: 51" - 70"', 'Material Type: Steel','Colour: Black');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 9,'Monster HDMI Cable','TV Accessories','Advanced High Speed HDMI Cable','4K HDTV. Blu-ray. HD Cable. Home video and photos. HDMI is the world standard in home entertainment connectivity. That''s why we''ve introduced Ultra HD™ HDMI. And theres nothing standard about it. All three products feature the speed, features and future proof guarantee that make Monster® Ultra HD™ the world standard.',25,69.99,null,0,'Transfer Speed: 18Gbps', 'Material: Gold Plated','Colour: Grey');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 10,'Chromecast Ultra','TV Accessories','Stream 4K Ultra HD & HDR Picture Quality Over Your Wi-Fi Network','A streaming device that plugs into your TVs HDMI port, Chromecast Ultra provides fast, reliable performance with minimal buffering and smooth streaming. Use your iPhone®, iPad®, Android device or laptop to stream from thousands of Cast-enabled apps.',25,58.34,44.99,1,'4K Support: Yes', 'HDR Support: Yes','Wi-fi Support: 802.11ac (2.4GHz/5Ghz) 1x2 SIMO Wi-Fi');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 11,'Sony 4K Ultra HD Blu-Ray Player','TV Accessories','Get The Real Cinema Experience With This 4K Ultra HD Blu-Ray Player','Get the real cinema experience with this 4K Ultra HD Blu-ray player. 4K UHD resolution gives you the big screen picture, while Dolby Atmos and DTS:X create the authentic cinema atmosphere.Find yourself at the heart of every movie and series. 4K Ultra HD Blu-ray shows everything in finer detail than ever before, so you feel like you’re seeing the real thing.',25,399.99,null,0,'4K Support: Yes', 'HDR Support: Yes','Dolby Atmos Support: Yes');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 12,'Apple TV 4K','TV Accessories','Make your favourite TV shows and films even more amazing','Apple TV 4K makes your favourite TV shows and films even more amazing. Videos play in stunning detail with picture quality that’s more true to life. Enjoy great content from iTunes and apps on the App Store — or use the Apple TV Remote to find just what you want.3 Apple TV 4K also features faster performance than ever with the A10X Fusion chip for all your games and apps.',25,219,null,0,'Resolution: 3840x2160', '>Storage Capacity: 64GB','HDR Support: HDR10 & Dolby Vision');

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 13,'Dell XPS 13 9360','Computing','Designed to be the best.','Erasing borders, starting with the display. The smallest 33.8 cm (13.3") laptop on the planet has the world’s first virtually borderless InfinityEdge display — available with touch.',25,1963.97,1750,1,'Processor: Intel Core i7 8550U', 'RAM: 16GB','Display: 13.3-Inch QHD+ (3200 x 1800) InfinityEdge touch display');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 14,'Apple MacBook Pro 13-Inch with Touchbar','Computing','A touch of genius.','The new MacBook Pro is razor-thin, feather-light and now even faster and more powerful than before. It has the brightest, most colourful Mac notebook display. And it has the revolutionary Touch Bar — a Multi-Touch–enabled strip of glass built into the keyboard for instant access to what you want to do, when you want to do it. The new MacBook Pro is built on groundbreaking ideas. And it’s ready for yours.',25,2099.00,null,0,'Processor: Intel Core i5 7250U', 'RAM: 8GB','Display: 13.3-Inch 2560 x 1600 IPS');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 15,'HP Spectre x360 15 Inch','Computing','Reovolutionary Power, Extroardinarily Thin.','Experience technology at its very best. Refined craftsmanship meets unquestionable power for a machine that does more than meet expectations – it transcends them. With the latest hardware, unbelievable battery life, and a 4K[1] display, this laptop excels at every turn, elegantly sliding into just the mode you need.',25,2209.99,1958.16,1,'Processor: Intel Core i7 8550U', 'RAM: 16GB','Display: 15.6-Inch 3840 x 2160 IPS');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 16,'Microsoft Surface Pro','Computing','>A best-in-class laptop, with the versatility of a studio and tablet.','Surface Pro 4 is light enough to take anywhere and powerful enough to use as a full desktop workstation.Incredibly versatile and ultrathin. Surface Pro 4 is meticulously crafted to be a powerful, ultrathin laptop — or a beautiful tablet that can stand on its own — all with up to 9 hours of video playback',25,919.00,null,0,'Processor: Intel Core i7 7600U', 'RAM: 16GB','Display: 12.3-Inch 2736 x 1824 10 Point Multi-Touch');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 17,'ASUS ZenBook 3 Deluxe UX490UA','Computing','The world’s most prestigious laptop, enhanced.','They say that you can’t improve on perfection. That’s a nice thought, but with the new ZenBook 3 Deluxe we’ve proved them wrong by taking the amazing ZenBook 3 and making it even better. ZenBook 3 Deluxe achieves the almost-impossible, featuring a gorgeous 14-inch display in an elegant and compact chassis that’s no bigger than many 13-inch laptops. It’s an unrivaled combination of power and beauty, giving you the perfect balance between portability and productivity. Measuring just 12.9mm thin and weighing only 1.1kg, ZenBook 3 Deluxe has everything you need for superb on-the-go performance, including a 8th Generation Intel® Core™ i7 processor, up to a 1TB PCIe® SSD, two USB Type-C™ (USB-C) ports with Thunderbolt™ 3 for dual 4K UHD display supports, and a powerful quad-speaker audio system. ZenBook 3 Deluxe takes ZenBook 3 to the next level — for the ultimate prestige and performance.',25,1078.97,null,0,'Processor: Intel Core i7 7500U', 'RAM: 16GB','Display: 14-Inch 1920 x 1080 IPS');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 18,'Lenovo ThinkPad X1 Yoga','Computing','Versatility to the Max','Mobile flexibility and striking design come together in the ThinkPad Yoga, a high-performance convertible business Ultrabook™ with four different usage modes — Laptop, Stand, Tent, and Tablet.',25,1309.99,null,0,'Processor: Intel Core i7 7500U', 'RAM: 16GB','Display: 14-Inch 2560 x 1440 OLED 10 Point Multi-touch');

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 19,'iPhone 8 64GB Space Grey','Phone','A beautiful mind.','Ready for a wireless world. The iPhone 8 and 8 Plus feature a new glass design. Powered by Apples A11 Bionic processor, these are the smartest iPhones ever.',25,829.00,null,0,'Screen Size : 4.7 inches', 'All glass and aluminium','Wireless charging');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 20,'Samsung Galaxy S7 32GB Black','Phone','Redefine what a phone can do','This is what a perfect balance between form and function looks like. The Galaxy S7 is not just a new phone. It brings a new way of thinking about what a phone can do. You defined the possibilities and we redefined the phone. The Galaxy S7 and S7 edge. Rethink what a phone can do. The beauty of what weve engineered is to give you the slimmest feel in your hand without compromising the big screen size. The elegantly curved front and back fit in your palm just right. Its as beautiful to look at as it is to use. We spent a long time perfecting the curves of the Galaxy S7 edge and S7. Using a proprietary process called 3D Thermoforming, we melted 3D glass to curve with such precision that it meets the curved metal alloy to create an exquisitely seamless and strong unibody.',25,896.67,null,0,'Android 7.0(Nougat)', '32GB Storage + Micro SD (Up to 256GB)','3000mAh battery, Up to 14 hours on Wi-Fi');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 21,'iPhone X 256GB','Phone','Say hello to the future.','Our vision has always been to create an iPhone that is entirely screen. One so immersive the device itself disappears into the experience. And so intelligent it can respond to a tap, your voice, and even a glance. With iPhone X, that vision is now a reality. Say hello to the future.',25,1349.00,null,0,'Wireless Charging', 'Dust and water resistance', 'Enhanced video and camera performance');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 22,'Samsung Galaxy A5','Phone','Simply elegant','The Samsung Galaxy A5 2017 Black has a stylish design that’s sleek, modern and made from premium materials. This is a device for all occasions. Whether you’re switching between apps or watching a movie whilst on the move. The stunning 5.2" HD Super AMOLED Display shows every detail and with a 3D curved back that allows the rear camera to sit flush, gripping the Galaxy A5 2017 Black is more comfortable than ever.',25,349.99,null,0,'Screen Size: 5.2 inches', 'Android OS, v6.0.1 (Marshmallow)','14 Hours talk time');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 23,'iPhone 6 32GB','Phone','A big step for samll.','iPhone 6 is the first iPhone to feature the now classic iPhone design, with a 4.7 inch Retina HD display and Touch ID home button. Powered by the Apple A8 processor, the iPhone 6 features an 8MP camera and Siri voice assistant, making it a great introduction to the world of Apple smartphones.',25,400,null,0,'Screen Size: 4.7 inches', '14 Hours talk time','iOS');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 24,'Alcatel U5 4G','Phone','Life happens in HD','Alcatel has now introduced the Alcatel U5 and what Alcatel refers to as “the most affordable 5″ 4G smartphone.” Needless to say, the two big selling points here, is that the Alcatel U5 comes with 4G LTE support and is priced super competitively. ',25,90.00,null,0,'Screen Size: 65 inches', '11 Hours talk time','Android 6.0');

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 25,'Seagate Expansion USB 3.0 Portable Hard Drive','Phone-Accessories','Simple and Instant Storage','The Seagate Expansion portable drive is compact and perfect for taking with you on the go. Add more storage space to your PC instantly and take large files with you when you travel. Set-up is straightforward: simply connect a single USB cable and you are ready to go. The drive is powered from the USB cable, so there is no need for an external power supply.',25,42.99,null,0,'500GB', 'Size: H1.48, W0.8, L11.7cm','Run speed 5400 rpm');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 26,'Eveready 5000mAh Portable Power Bank','Phone-Accessories','Long-lasting and affordable','The Eveready power bank 5000mAh is a powerful, compact and portable battery. Eveready Power Bank Protection against Overcharge, short-circuit, Over discharged and Overvoltage. Blue Colour LED display of remaining power. Charges 2 smartphones or USB devices. Comes with Micro USB cable.',25,29.90,null,0,'Thin Design', 'Itelligent LEDs show the remaining power','Charges 2 smartphones or USB devices');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 27,'Energizer iPhone 7 Plus Screen Protector','Phone-Accessories','The best protection on the market','Energizer tempered glass screen protector for iphone 7 Plus.This tempered glass screen protector is made to protect the screen of your smartphone from damage and scratches, thanks to the use of glass has been reinforced to absorp shocks. It gives much more efficient than PVC films.Made of tempered glass, it provides you with a super strong protection to the test against scratches, scrapes, and bumps, protecting it, your touch screen. The glass has a thickness of 0.39 mm. Once installed, there are no spaces between the screen and the glass which means the touch screens sensitivity is not affected.',25,17.90,null,0,'Bubble free', 'Thickness: 0.39mm','5x More resistant than standard glass');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 28,'IWANTIT I1ACWH16 Universal USB Car Charger','Phone-Accessories','Keep your devices energized','Make sure you can keep your phone, tablet and other devices powered up while you drive. The iWantit I1ACWH16 USB Car Charger offers a USB port and car cigarette lighter attachment for easy, direct connections. Now you can always stay prepared - chargie your devices on your way to a meeting, while youre driving to a holiday destination or just give it some power before you get on the train.',25,6.99,null,0,'Car adapter', 'USB & Cigarette lighter connection','Compatible with USB devices');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 29,'Sandisk Ultra Micro SD Card 32GB','Phone-Accessories','Shoot, Save, and Share more than ever before','Store up to 32GB with the microSDHC memory card. With a read speed of 80MB per second, this memory card also includes a microSD adaptor to convert to SD size for compatible devices.',25,20.99,null,0,'Including SanDisk Memory app', 'Fast speed up to 30MB/s','Includes SD adapter');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 30,'Otterbox Phone case','Phone-Accessories','Sleek Stylish Safeguard','Sleek Protection: With Symmetry Series Clear for Galaxy S8 plus, thin equals tough. Featuring an ultra-slim profile and OtterBox Certified Drop Protection, Symmetry Series stays true to your phones sleek design. Plus, the clear, scratch-resistant exterior highlights your impeccable taste in technology.',25,29.99,null,0,'Highly protective', 'One-piece construction','Pocket-fit protection');

INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 31,'Apple iPad','Tablets','Flat-out fun.','Powerful, portable and personal with a gorgeous 9.7-inch Retina display in a thin, durable aluminium design that weighs less than half a kilo. iPad puts incredible capabilities in your hands with a powerful A9 chip, 8MP camera, FaceTime HD camera, Touch ID, Apple Pay and Wi-Fi, 3 all-day battery life, and over a million apps on the App Store.',25,339.00,null,0,'Display: 9.7-inch Multi-Touch display with IPS technology 2048 x 1536', 'Chip: A9 chip with 64-bit architecture and Embedded M9 coprocessor','Storage Capacity: 128GB');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 32,'Samsung Galaxy Tab S3','Tablets','The all-new versatile Tab S3','Powerful, portable and personal with a gorgeous 9.7-inch Retina display in a thin, durable aluminium design that weighs less than half a kilo. iPad puts incredible capabilities in your hands with a powerful A9 chip, 8MP camera, FaceTime HD camera, Touch ID, Apple Pay and Wi-Fi, 3 all-day battery life, and over a million apps on the App Store.',25,599.00,null,0,'Display: 9.7-Inch 2048 x 1536 Super AMOLED', 'Chip: Snapdragon 820 Quad Core','Storage Capacity: 32GB');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 33,'Huawei MediaPad M3','Tablets','Celebrating your senses','Sleek, stylish curves give emphasis to modern industrial design cues. Crafted from aerospace-grade aluminium, each light, yet sturdy, uni-body shell is sculpted by a 5-axis CNC machine, exemplifying HUAWEI MediaPad M3s cutting-edge technological heritage',25,239.99,205.99,1,'Display: 8.4-Inch 2560 x 1600 IPS', 'Chip: HUAWEI HiSilicon Kirin octa-core processor','Storage Capacity: 64GB');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 34,'ASUS ZenPad 10','Tablets','Luxury On Your Terms','The all-new ASUS ZenPad 10 fuses the latest technology with a fashionable, modern design featuring clean lines and embossed knit-patterning for a tablet that delivers incredible entertainment experiences and stylish appeal',25,169.99,null,0,'Display: 10.1-Inch 1920 x 1080 IPS', 'Chip: MTK MT8163A Quad-Core','Storage Capacity: 32GB');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 35,'Google Pixel C','Tablets','A fast tablet with a high-resolution display, all in one compact design.','####',25,499.00,null,0,'Display: 10.2-Inch 2560 x 1800 LTPS Display', 'Chip: NVIDIA Tegra® X1 with Maxwell GPU','Storage Capacity: 64GB');
INSERT INTO PRODUCT (id,name,category,description_s,description_l,stock,price,sale_price,on_sale,spec1,spec2,spec3) VALUES ( 36,'Amazon Fire HD 7','Tablets','Amazon''s best selling Fire Tablet - now even better','The best-selling Fire tablet – now thinner, lighter, and with an improved display for enhanced readability. Featuring Alexa, a cloud-based voice service that provides quick access to the entertainment you want, including music, games, audiobooks, and more. Ask Alexa questions, get news, find sports scores, and even control your smart home.',25,35.00,null,0,'Display: 7-Inch 1024 x 600 IPS', 'Chip: Quad-core 1.3 GHz','Storage Capacity: 16GB');

INSERT INTO USER (role, email,first_name,last_name,password) VALUES ('admin', 'admin@products.com', 'Alice','Admin', 'password', );
INSERT INTO USER (role, email,first_name,last_name,password,phone_number,street1,street2,town,post_code,credit_card) VALUES ('customer', 'customer@products.com', 'Charlie','Customer', 'password', '0877777777', '64', 'Zoo Lane', 'Dublin', 'D22', '1231231' );
